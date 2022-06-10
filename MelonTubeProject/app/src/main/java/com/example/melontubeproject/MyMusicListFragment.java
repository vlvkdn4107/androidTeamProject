package com.example.melontubeproject;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.MusicAdapter;
import com.example.melontubeproject.adapter.MyMusicListAdapter;
import com.example.melontubeproject.databinding.FragmentMyMusicListBinding;
import com.example.melontubeproject.models.Data;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MyMusicListFragment extends Fragment {
    private static MyMusicListFragment myMusicListFragment;
    private FragmentMyMusicListBinding binding;
    private MusicAdapter musicAdapter;
    private MusicService musicService;
    private MyMusicListAdapter myMusicListAdapter;


    public List<Music> myMusicList = new ArrayList<>();

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
        musicService = MusicService.retrofit.create(MusicService.class);
        Log.d("TAG", "마이리스트 프래그먼트 onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMyMusicListBinding.inflate(inflater, container, false);
        setRecycleListView(myMusicList);
        getMyMusicList();
        return binding.getRoot();
    }


    private void getMyMusicList() {
        myMusicListAdapter.initMyMusicList(myMusicList);
    }

    private void setRecycleListView(List<Music> musicList) {
        myMusicListAdapter = new MyMusicListAdapter();
        myMusicListAdapter.initMyMusicList(musicList);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.myMusicRecyclerview;

        recyclerView.setAdapter(myMusicListAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

    }

}