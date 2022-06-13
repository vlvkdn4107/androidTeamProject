package com.example.melontubeproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.melontubeproject.adapter.SearchingAdapter;
import com.example.melontubeproject.databinding.FragmentSearchBinding;
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.interfaces.OnSearchClicked;
import com.example.melontubeproject.models.Data;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchFragment extends Fragment implements OnAddListClicked, OnPlayBtnClicked {

    private static SearchFragment searchFragment;
    private FragmentSearchBinding binding;
    private MusicService musicService;
    private SearchingAdapter searchingAdapter;
    //private boolean isDuplicateData = true;
    private boolean isFirstLoading = true;

    //private List<Music> list = new ArrayList<>();

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
        binding = FragmentSearchBinding.inflate(getLayoutInflater());

        setRecycleView();
        addTextWatcher();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return binding.getRoot();
    }

    private void addTextWatcher() {

        binding.searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(count >1) {
                    String keyword = binding.searchTextField.getEditText().getText().toString();
                    musicService.getSearch(keyword, keyword)
                            .enqueue(new Callback<Data>() {

                                @Override
                                public void onResponse(Call<Data> call, Response<Data> response) {
                                    List<Music> list = response.body().getMusicList();
                                    searchingAdapter.searchAddItem(list);
                                    //isDuplicateData = true;
                                }

                                @Override
                                public void onFailure(Call<Data> call, Throwable t) {
                                    Log.d("TAG", "네트워크 불안정 !!!");
                                    Toast.makeText(getContext(), "네트워크가 불안정합니다.", Toast.LENGTH_SHORT).show();
                                }
                            });
                }



            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void setRecycleView() {
        searchingAdapter = new SearchingAdapter();
        searchingAdapter.setOnAddListClicked(this);
        searchingAdapter.setOnPlayBtnClicked(this);
        //searchingAdapter.initItemList(musicList);

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
                        // 내 재생목록에 Music 객체 담기
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

}