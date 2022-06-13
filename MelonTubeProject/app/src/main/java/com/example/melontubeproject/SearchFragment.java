package com.example.melontubeproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.SearchingAdapter;
import com.example.melontubeproject.databinding.FragmentSearchBinding;
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.interfaces.OnSearchClicked;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment implements OnAddListClicked, OnPlayBtnClicked, OnSearchClicked {

    private static SearchFragment searchFragment;
    private FragmentSearchBinding binding;
    private MusicService musicService;
    private SearchingAdapter searchingAdapter;
    private boolean isDuplicateData = true;
    private boolean flag = true;

    private List<Music> list = new ArrayList<>();

    private SearchFragment() {

    }

    public static SearchFragment getInstance() {
        if (searchFragment == null) {
            searchFragment = new SearchFragment();
        }
        return searchFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicService = MusicService.retrofit.create(MusicService.class);


    }


    @Override
    public void onResume() {
        super.onResume();
        if (binding.searchText.length() > 1) {
            setRecycleView(list);
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        EventListener();
        binding.searchTextField.setEndIconOnClickListener(v -> {
            binding.searchText.setText("");
            list = new ArrayList<Music>();
            setRecycleView(list);
        });

        return binding.getRoot();
    }

    private void EventListener() {
        binding.searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("TAG","start :" + start + "//" + "before :" + before + "//" + "count : " + count);
                if (before > 0 || start >0) {
                    if(count != 0){
                        requestMusicData();
                        setRecycleView(list);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    private void requestMusicData() {
        String keyword = binding.searchText.getText().toString();
        musicService.getSearch(keyword, keyword)
                .enqueue(new Callback<List<Music>>() {

                    @Override
                    public void onResponse(Call<List<Music>> call, Response<List<Music>> response) {
                        list = response.body();

                        searchingAdapter.searchAddItem(list);
                        isDuplicateData = true;
                    }

                    @Override
                    public void onFailure(Call<List<Music>> call, Throwable t) {
                        Log.d("TAG", "네트워크 불안정 !!!");
                        Toast.makeText(getContext(), "네트워크가 불안정합니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void setRecycleView(List<Music> musicList) {
        searchingAdapter = new SearchingAdapter();
        searchingAdapter.setOnAddListClicked(this);
        searchingAdapter.setOnPlayBtnClicked(this);
        searchingAdapter.setOnSearchClicked(this);
        searchingAdapter.initItemList(musicList);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.searchRecyclerView;

        recyclerView.setAdapter(searchingAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        // 스크롤 내릴 때 이벤트 처리
        binding.searchRecyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {

            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                LinearLayoutManager layoutManager = (LinearLayoutManager) binding.searchRecyclerView.getLayoutManager();
                int lastVisibleItemPositon = layoutManager.findLastVisibleItemPosition();

                int itemTotalCount = binding.searchRecyclerView.getAdapter().getItemCount() - 1;

                if (lastVisibleItemPositon == itemTotalCount) {
                    isDuplicateData = false;
                    requestMusicData();
                }

                // TODO 50개 데이터 다 내리면 스크롤바 안되도록
            }
        });
    }

    @Override
    public void addMyList(Music music) {
        // 내 재생목록에 노래 추가
        musicService.addMyList(music)
                .enqueue(new Callback<Music>() {
                    @Override
                    public void onResponse(Call<Music> call, Response<Music> response) {

                        // 내 재생목록에 Music 객체 담기
                        // Music이 샘플 데이터 갖고 있는 것처럼 내 재생목록 객체를 만들어서 그 안에 내 재생목록 저장하기

                        Music myMusic = response.body();
                        MyMusicListFragment.getInstance().myMusicList.add(myMusic);

                        Toast.makeText(getContext(), "내 재생목록에 추가되었습니다.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Music> call, Throwable t) {
                        Toast.makeText(getContext(), "네트워크 연결이 불안정합니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    public void playMusic(Music music) {
        // 노래 재생화면
        Intent intent = new Intent(getContext(), MusicPlayActivity.class);
        intent.putExtra("music", music);
        startActivity(intent);
    }

    @Override
    public void searchMusic(Music music) {

    }
}