package com.example.melontubeproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.ChartAdapter;
import com.example.melontubeproject.adapter.MyMusicListAdapter;
import com.example.melontubeproject.databinding.FragmentMyMusicListBinding;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.interfaces.OndeleteBtnClicked;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;


public class MyMusicListFragment extends Fragment implements OnPlayBtnClicked, OndeleteBtnClicked {
    private static MyMusicListFragment myMusicListFragment;
    private FragmentMyMusicListBinding binding;
    private ChartAdapter chartAdapter;
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
        myMusicListAdapter.setOnPlayBtnClicked(this);
        myMusicListAdapter.setOndeleteBtnClicked(this);
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
        myMusicListAdapter.notifyDataSetChanged();
        Log.d("TAG", music.getTitle());
    }
}