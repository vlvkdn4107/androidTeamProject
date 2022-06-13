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

    private static List<Music> list = new ArrayList<>();

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
        if (binding.searchText.getText().length() != 0) {
            setRecycleView(list);
            searchingAdapter.searchAddItem(list);
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        addEventListener();
        binding.searchTextField.setEndIconOnClickListener(v -> {
            binding.searchText.setText("");
            list = new ArrayList<Music>();
            setRecycleView(list);
        });

        return binding.getRoot();
    }

    private void addEventListener() {
        binding.searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("TAG", "start :" + start + "//" + "before :" + before + "//" + "count : " + count);
                if (before > 0 || start > 0) {
                    if (count != 0) {
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

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.searchRecyclerView;

        recyclerView.setAdapter(searchingAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void addMyList(Music music) {
        // 내 재생목록에 노래 추가
        musicService.addMyList(music)
                .enqueue(new Callback<Music>() {
                    @Override
                    public void onResponse(Call<Music> call, Response<Music> response) {
                        List<Music> myList = MyMusicListFragment.getInstance().myMusicList;
                        Music myMusic = response.body();
                        Log.d("TAG", myMusic.getTitle());

                        // 중복제거
                        if (myList.size() > 1) {
                            for (int i = 0; i < myList.size(); i++) {
                                if (myList.get(i).getTitle().equals(myMusic.getTitle())) {
                                    Log.d("TAG", "Search 프래그먼트 같습니다 !!!");
                                    return;
                                } else {
                                    myList.add(myMusic);
                                    Log.d("TAG", "Search 프래그먼트 나의 재생목록 추가 !!!");
                                }
                            }
                        } else {
                            myList.add(myMusic);
                            Log.d("TAG", "추가되었습니다 !!!");
                        }

                        ChartFragment.getInstance().setSaveMyMusic(getContext(), "savemusic", myList);
                        MyMusicListFragment.getInstance().myMusicList = myList;
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