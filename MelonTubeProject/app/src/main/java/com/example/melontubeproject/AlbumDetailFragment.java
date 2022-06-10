package com.example.melontubeproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlbumDetailFragment extends Fragment {

    public AlbumDetailFragment() {
        // Required empty public constructor
    }

    public static AlbumDetailFragment getInstance(String param1, String param2) {
        AlbumDetailFragment fragment = new AlbumDetailFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album_detail, container, false);
    }
}