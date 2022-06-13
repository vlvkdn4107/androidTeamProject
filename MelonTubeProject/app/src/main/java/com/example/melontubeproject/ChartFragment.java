package com.example.melontubeproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.ChartAdapter;
import com.example.melontubeproject.adapter.RecentAlbumAdapter;
import com.example.melontubeproject.databinding.FragmentChartBinding;
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.models.Album;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChartFragment extends Fragment implements OnAddListClicked, OnPlayBtnClicked {

    private static ChartFragment chartFragment;
    private MusicService musicService;
    private FragmentChartBinding binding;
    private ChartAdapter chartAdapter;
    private RecentAlbumAdapter recentAlbumAdapter;

    // 다른 프래그먼트 갔다 와도 보던 목록 그대로 있게
    private boolean isFirstUpload = true;

    public List<Music> musicList = new ArrayList<>();
    public List<Album> albumList = new ArrayList<>();

    private static final String TAG = ChartFragment.class.getName();

    Set<Music> musicSet = new HashSet<>();

    private ChartFragment() {
    }

    public static ChartFragment getInstance() {
        if (chartFragment == null) {
            chartFragment = new ChartFragment();
        }
        return chartFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicService = MusicService.retrofit.create(MusicService.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentChartBinding.inflate(inflater, container, false);
        setRecycleView();

        if (isFirstUpload) {
            requestMusicData();
        }
        return binding.getRoot();
    }

    private void requestMusicData() {

        Log.d(TAG, "통신 요청 확인");

        musicService.musicList()
                .enqueue(new Callback<List<Music>>() {
                    @Override
                    public void onResponse(Call<List<Music>> call, Response<List<Music>> response) {
                        chartAdapter.addItem(response.body());
                        isFirstUpload = false;
                    }

                    @Override
                    public void onFailure(Call<List<Music>> call, Throwable t) {
                        Toast.makeText(getContext(), "네트워크가 불안정합니다.", Toast.LENGTH_SHORT).show();
                    }
                });

        musicService.albumMusicList()
                .enqueue(new Callback<List<Album>>() {
                    @Override
                    public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                        recentAlbumAdapter.addAlbumItem(response.body());
                        isFirstUpload = false;
                    }

                    @Override
                    public void onFailure(Call<List<Album>> call, Throwable t) {

                    }
                });

    }

    private void setRecycleView() {
        chartAdapter = new ChartAdapter();
        chartAdapter.setOnAddListClicked(this);
        chartAdapter.setOnPlayBtnClicked(this);
        chartAdapter.initItemList(musicList);

        recentAlbumAdapter = new RecentAlbumAdapter();
        recentAlbumAdapter.initItemList(albumList);

        RecyclerView recyclerView = binding.recyclerView;
        RecyclerView horizontalRecyclerView = binding.horizentalRecyclerView;

        recyclerView.setAdapter(chartAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        horizontalRecyclerView.setAdapter(recentAlbumAdapter);
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(
                getContext(), LinearLayoutManager.HORIZONTAL, false));
        horizontalRecyclerView.setHasFixedSize(true);
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

                        // 중복제거
                        // A List

                        if (myList.size() > 1) {
                            MyMusicListFragment.getInstance().myMusicList.forEach(music1 -> {
                                if (music1.getTitle().equals(myMusic.getTitle())) {
                                    Log.d(TAG, "같습니다.");
                                } else {
                                    myList.add(myMusic);
                                }
                            });
                        } else {
                            myList.add(myMusic);
                        }

                        //myList.add(myMusic);

                        // OOP 상위 title

//                        for (int i = 0; i < myList.size(); i++) {
//                            musicSet.add(myList.get(i));
//                        }
//
//                        Iterator<Music> iter = musicSet.iterator();
//
//                        while (iter.hasNext()) {
//                            Log.d(TAG, iter.next().getTitle());
//                        }


//                        List<Music> newMyList = new ArrayList<Music>();

                        //newMyList =  musicSet;

                        List<Music> fffList = MyMusicListFragment.getInstance().myMusicList;
                        fffList.addAll(fffList.size(), myList);

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