package com.example.melontubeproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melontubeproject.databinding.FragmentChartBinding;
import com.example.melontubeproject.repository.MusicService;

public class ChartFragment extends Fragment {

    private static ChartFragment chartFragment;
    private MusicService musicService;
    private FragmentChartBinding binding;

    private ChartFragment() {
    }

    public static ChartFragment getInstance() {
        if(chartFragment == null) {
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

        return binding.getRoot();
    }
}