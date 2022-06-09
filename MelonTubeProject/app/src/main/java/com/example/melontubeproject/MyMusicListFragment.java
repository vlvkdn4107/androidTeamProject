package com.example.melontubeproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melontubeproject.adapter.MusicAdapter;
import com.example.melontubeproject.databinding.FragmentMyMusicListBinding;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;


public class MyMusicListFragment extends Fragment {
    private static MyMusicListFragment myMusicListFragment;
    private FragmentMyMusicListBinding binding;
    private MusicAdapter musicAdapter;

    private List<Music> mymusiclist = new ArrayList<>();

    public MyMusicListFragment() {
    }

    public static MyMusicListFragment getInstance(){
        if (myMusicListFragment == null){
            myMusicListFragment = new MyMusicListFragment();
        }
        return myMusicListFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addMusic();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_music_list, container, false);
    }
    private void addMusic(){

//        mymusiclist.add()
    }
}