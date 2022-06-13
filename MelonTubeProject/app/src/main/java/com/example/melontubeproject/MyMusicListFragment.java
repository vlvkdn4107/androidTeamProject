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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.MyMusicListAdapter;
import com.example.melontubeproject.databinding.FragmentMyMusicListBinding;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.interfaces.OnSaveMymusic;
import com.example.melontubeproject.interfaces.OnDeleteBtnClicked;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;


public class MyMusicListFragment extends Fragment implements OnPlayBtnClicked, OnDeleteBtnClicked, OnSaveMymusic{
    private static MyMusicListFragment myMusicListFragment;
    private FragmentMyMusicListBinding binding;
    private MusicService musicService;
    private MyMusicListAdapter myMusicListAdapter;
    private SharedPreferences preferences;


    public List<Music> myMusicList = new ArrayList<>();
    public String save;

    public MyMusicListFragment() {

    }

    public static MyMusicListFragment getInstance() {
        if (myMusicListFragment == null) {
            myMusicListFragment = new MyMusicListFragment();
        }
        return myMusicListFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 수정 해야될것들
        // 삭제하고 나서 다시 mylist로 넘어가면은 삭제됬던게 다시 나온다.
        // shared에서는 삭제안해서 그렇다.

        musicService = MusicService.retrofit.create(MusicService.class);
        Log.d("TAG", "마이리스트 프래그먼트 onCreate()");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        preferences = PreferenceManager.getDefaultSharedPreferences(container.getContext());
        save = preferences.getString("savemusic", "");
        Log.d("TAG",  save);
        myMusicList = getSaveMyMusicList(container.getContext(), save);

        binding = FragmentMyMusicListBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setRecycleListView(myMusicList);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG","onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        myMusicListAdapter.notifyDataSetChanged();
        Log.d("TAG","onResume");
    }

    private void setRecycleListView(List<Music> musicList) {
        myMusicListAdapter = new MyMusicListAdapter();
        myMusicListAdapter.initMyMusicList(musicList);
        myMusicListAdapter.setOnPlayBtnClicked(this);
        myMusicListAdapter.setOndeleteBtnClicked(this);
        myMusicListAdapter.setOnSaveMymusic(this);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.myMusicRecyclerview;

        recyclerView.setAdapter(myMusicListAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

    }

    @Override
    public void playMusic(Music music) {
        Intent intent = new Intent(getContext(), MusicPlayActivity.class);
        intent.putExtra("music", music);
        startActivity(intent);
    }

    @Override
    public void deleteMusic(Music music) {
        myMusicList.remove(music);
        Log.d("TAG",myMusicList + " 삭제");
        myMusicListAdapter.notifyDataSetChanged();

    }


    @Override
    public List<Music> getSaveMyMusicList(Context context, String data) {
        Gson gson = new GsonBuilder().create();
        ArrayList list = new ArrayList();
        if (data != null) {
            try {
                JSONArray jsonArray = new JSONArray(data);
                for (int i = 0; i < jsonArray.length(); i++) {
                    Music music = gson.fromJson(jsonArray.get(i).toString(), Music.class);
                    list.add(music);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}