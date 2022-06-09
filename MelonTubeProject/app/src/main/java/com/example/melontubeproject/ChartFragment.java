package com.example.melontubeproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.melontubeproject.adapter.MusicAdapter;
import com.example.melontubeproject.databinding.FragmentChartBinding;
import com.example.melontubeproject.models.Data;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChartFragment extends Fragment {

    private static ChartFragment chartFragment;
    private MusicService musicService;
    private FragmentChartBinding binding;
    private MusicAdapter musicAdapter;

    private List<Music> list = new ArrayList<>();

    private static final String TAG = ChartFragment.class.getName();

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

        Log.d("TAG", "차트 프래그먼트 생성 확인");
        musicService = MusicService.retrofit.create(MusicService.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentChartBinding.inflate(inflater, container, false);
        setRecycleView(list);
        requestMusicData();

        return binding.getRoot();
    }

    private void requestMusicData() {

        Log.d("TAG", "통신 요청 확인");

        musicService.getMusicList()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        List<Music> list = response.body().getMusicList();

                        musicAdapter.addItem(list);
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        Toast.makeText(getContext(), "네트워크가 불안정합니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void setRecycleView(List<Music> musicList) {
        musicAdapter = new MusicAdapter();
        musicAdapter.initItemList(musicList);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.recyclerView;;
        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        // 스크롤 내릴 때 이벤트 처리
        binding.recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {

            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });
    }
}