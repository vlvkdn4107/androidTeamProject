package com.example.melontubeproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.adapter.AlbumDetailAdapter;
import com.example.melontubeproject.adapter.AlbumDetailTrackListAdapter;
import com.example.melontubeproject.databinding.ActivityAlbumDetailBinding;
import com.example.melontubeproject.models.Album;
import com.example.melontubeproject.repository.MusicService;

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
            setRecycleView();
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

    private void setRecycleView() {
        albumDetailAdapter = new AlbumDetailAdapter();
        albumDetailTrackListAdapter = new AlbumDetailTrackListAdapter();

        RecyclerView albumInfoRecyclerView = binding.albumInfoRecyclerView;
        RecyclerView albumTrackListRecyclerView = binding.albumTrackListRecyclerView;

        albumInfoRecyclerView.setAdapter(albumDetailAdapter);
        albumInfoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        albumInfoRecyclerView.setHasFixedSize(true);

        albumTrackListRecyclerView.setAdapter(albumDetailTrackListAdapter);
        albumTrackListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        albumTrackListRecyclerView.setHasFixedSize(true);
    }
}