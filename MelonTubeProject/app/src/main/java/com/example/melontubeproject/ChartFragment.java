package com.example.melontubeproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
import com.example.melontubeproject.utils.Define;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChartFragment extends Fragment implements OnAddListClicked, OnPlayBtnClicked {

    private static ChartFragment chartFragment;
    private MusicService musicService;
    private FragmentChartBinding binding;
    private ChartAdapter chartAdapter;
    private RecentAlbumAdapter recentAlbumAdapter;

    private boolean isFirstUpload = true;

    public List<Music> musicList = new ArrayList<>();
    public List<Album> albumList = new ArrayList<>();

    private SharedPreferences preferences;
    private String save;

    private List<Music> tempList = new ArrayList<>();

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

        preferences = PreferenceManager.getDefaultSharedPreferences(container.getContext());
        save = preferences.getString(Define.SAVE_MUSIC, "");

        if (isFirstUpload) {
            requestMusicData();
        }
        return binding.getRoot();
    }

    private void requestMusicData() {

        // 샘플 데이터 불러오기
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

        // 앨범 별 노래리스트 불러오기
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
        RecyclerView horizontalRecyclerView = binding.horizontalRecyclerView;

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
                        Music myMusic = response.body();

                        // 중복제거
                        if (tempList.size() > 0) {
                            for (int i = 0; i < tempList.size(); i++) {
                                if (tempList.get(i).getTitle().equals(myMusic.getTitle())) {
                                    Toast.makeText(getContext(), "이미 추가된 곡입니다.", Toast.LENGTH_SHORT).show();
                                    return;
                                }
                            }
                            tempList.add(myMusic);
                            setSaveMyMusic(getContext(), Define.SAVE_MUSIC, tempList);
                        }

                        if (tempList.isEmpty()) {
                            tempList.add(myMusic);
                            setSaveMyMusic(getContext(), Define.SAVE_MUSIC, tempList);
                        }
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
        intent.putExtra(Define.OBJ_MUSIC, music);
        startActivity(intent);
    }

    // 리스트 파싱해서 SharedPreferences에 담기
    public void setSaveMyMusic(Context context, String key, List<Music> values) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        JSONArray jsonArray = new JSONArray();
        Gson gson = new GsonBuilder().create();
        for (int i = 0; i < values.size(); i++){
            String str = gson.toJson(values.get(i), Music.class);
            jsonArray.put(str);
        }
        if(!values.isEmpty()){
            editor.putString(Define.SAVE_MUSIC,jsonArray.toString()).apply();
            editor.remove(Define.DELETE_MUSIC).commit();
        }
        editor.apply();
    }

}