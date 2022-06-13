package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.melontubeproject.adapter.AlbumDetailAdapter;
import com.example.melontubeproject.adapter.AlbumDetailTrackListAdapter;
import com.example.melontubeproject.databinding.ActivityAlbumDetailBinding;
import com.example.melontubeproject.databinding.ActivityMusicPlayBinding;
import com.example.melontubeproject.databinding.FragmentChartBinding;
import com.example.melontubeproject.models.Album;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumDetailActivity extends AppCompatActivity {

    private MusicService musicService;
    private AlbumDetailAdapter albumDetailAdapter;
    private AlbumDetailTrackListAdapter albumDetailTrackListAdapter;
    private ActivityAlbumDetailBinding binding;

    private Album album = new Album();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        musicService = MusicService.retrofit.create(MusicService.class);
        binding = ActivityAlbumDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent() != null) {
            album = (Album) getIntent().getSerializableExtra("album");
            setRecycleView(album);
            requestAlbumData(album);
        }

    }

    private void requestAlbumData(Album album) {

        musicService.albumInfo(album.getAlbumTitle())
                .enqueue(new Callback<Album>() {
                    @Override
                    public void onResponse(Call<Album> call, Response<Album> response) {
                        Album album = response.body();
                        albumDetailAdapter.initItem(album);
                        albumDetailTrackListAdapter.initItemList(album.getTrackList());

                    }

                    @Override
                    public void onFailure(Call<Album> call, Throwable t) {

                    }
                });
    }

    private void setRecycleView(Album album) {
        albumDetailAdapter = new AlbumDetailAdapter();
        albumDetailTrackListAdapter = new AlbumDetailTrackListAdapter();

        RecyclerView albumInfoRecyclerView = binding.albumInforecyclerView;
        RecyclerView albumTrackListRecyclerView = binding.albumTrackListRecyclerView;

        albumInfoRecyclerView.setAdapter(albumDetailAdapter);
        albumInfoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        albumInfoRecyclerView.setHasFixedSize(true);

        albumTrackListRecyclerView.setAdapter(albumDetailTrackListAdapter);
        albumTrackListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        albumTrackListRecyclerView.setHasFixedSize(true);

    }
}