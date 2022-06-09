package com.example.melontubeproject;

import android.content.Intent;
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
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.models.Data;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChartFragment extends Fragment implements OnAddListClicked, OnPlayBtnClicked {

    private static ChartFragment chartFragment;
    private MusicService musicService;
    private FragmentChartBinding binding;
    private MusicAdapter musicAdapter;

    private boolean isDuplicateData = true;

    private List<Music> list = new ArrayList<>();

    private static final String TAG = ChartFragment.class.getName();

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
        setRecycleView(list);
        requestMusicData();

        return binding.getRoot();
    }

    private void requestMusicData() {

        Log.d(TAG, "통신 요청 확인");

        musicService.getMusicList()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        List<Music> list = response.body().getMusicList();

                        musicAdapter.addItem(list);
                        isDuplicateData = true;
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        Toast.makeText(getContext(), "네트워크가 불안정합니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void setRecycleView(List<Music> musicList) {
        musicAdapter = new MusicAdapter();
        musicAdapter.setOnAddListClicked(this);
        musicAdapter.setOnPlayBtnClicked(this);
        musicAdapter.initItemList(musicList);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());

        RecyclerView recyclerView = binding.recyclerView;

        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        // 스크롤 내릴 때 이벤트 처리
        binding.recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() {

            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                LinearLayoutManager layoutManager = (LinearLayoutManager) binding.recyclerView.getLayoutManager();
                int lastVisibleItemPositon = layoutManager.findLastVisibleItemPosition();

                int itemTotalCount = binding.recyclerView.getAdapter().getItemCount() - 1;

                if (lastVisibleItemPositon == itemTotalCount) {
                    isDuplicateData = false;
                    requestMusicData();
                }

                // TODO 50개 데이터 다 내리면 스크롤바 안되도록
            }
        });
    }

    @Override
    public void addMyList(Music music) {
        // 내 재생목록에 노래 추가
        musicService.addMyList(music)
                .enqueue(new Callback<Music>() {
                    @Override
                    public void onResponse(Call<Music> call, Response<Music> response) {

                        // 내 재생목록에 Music 객체 담기
                        // Music이 샘플 데이터 갖고 있는 것처럼 내 재생목록 객체를 만들어서 그 안에 내 재생목록 저장하기

                        Music myMusic = response.body();
                        Log.d(TAG, myMusic.getTitle());

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