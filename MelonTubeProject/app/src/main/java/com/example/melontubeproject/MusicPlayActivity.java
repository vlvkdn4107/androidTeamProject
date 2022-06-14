package com.example.melontubeproject;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.databinding.ActivityMusicPlayBinding;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MusicPlayActivity extends AppCompatActivity {

    private Music music;
    private ActivityMusicPlayBinding binding;
    private MusicService musicService;

    private SimpleExoPlayer simpleExoPlayer;
    private StyledPlayerControlView playerControlView;

    private ImageButton playBtn;
    private ImageButton stopBtn;
    private ImageButton skipNextBtn;
    private ImageButton skipPreviousBtn;

    private final String TAG = MusicPlayActivity.class.getName();

    public final String OBJ_NAME = "music";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMusicPlayBinding.inflate(getLayoutInflater());
        musicService = MusicService.retrofit.create(MusicService.class);
        setContentView(binding.getRoot());

        if (getIntent() != null) {
            music = (Music) getIntent().getSerializableExtra(OBJ_NAME);
            setData(music);
            addEventListener();
            setExoPlayer();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        simpleExoPlayer.release();
    }

    private void setData(Music music) {
        binding.titlePlayText.setText(music.getTitle());
        binding.singerPlayText.setText(music.getSinger());
        binding.lyricsTextView.setText(music.getLyrics());
        binding.scrollView.setVisibility(View.INVISIBLE);

        Glide.with(this)
                .load(music.getImageUrl())
                .into(binding.albumPlayImage);

    }

    private void addEventListener() {
        // 다음 노래 재생 버튼 클릭
        playBtn = findViewById(R.id.exo_play);
        stopBtn = findViewById(R.id.exo_pause);
        skipNextBtn = findViewById(R.id.exo_next_btn);
        skipPreviousBtn = findViewById(R.id.exo_prev);

        // 앨범 커버 클릭시 가사 보이게
        binding.albumPlayImage.setOnClickListener(v -> {
            binding.scrollView.setVisibility(View.VISIBLE);
        });

        binding.lyricsTextView.setOnClickListener(v -> {
            binding.scrollView.setVisibility(View.GONE);
        });

        playBtn.setOnClickListener(v -> {

            Log.d(TAG, simpleExoPlayer.isPlaying() + " : PlayBtn");

            if (!simpleExoPlayer.isPlaying()) {
                playBtn.setVisibility(View.INVISIBLE);
                stopBtn.setVisibility(View.VISIBLE); 
                playBtn.setEnabled(false);
                stopBtn.setEnabled(true);
                simpleExoPlayer.play();
            }

        });

        stopBtn.setOnClickListener(v -> {

            Log.d(TAG, simpleExoPlayer.isPlaying() + " : StopBtn");

            if (simpleExoPlayer.isPlaying()) {
                stopBtn.setVisibility(View.INVISIBLE);
                playBtn.setVisibility(View.VISIBLE);
                playBtn.setEnabled(true);
                stopBtn.setEnabled(false);
                simpleExoPlayer.pause();
            }

        });

        skipNextBtn.setOnClickListener(v -> {
            musicService.skipNextMusic(music.getId())
                    .enqueue(new Callback<Music>() {
                        @Override
                        public void onResponse(Call<Music> call, Response<Music> response) {
                            music = response.body();
                            setData(music);
                            setExoPlayer();
                        }

                        @Override
                        public void onFailure(Call<Music> call, Throwable t) {
                            Toast.makeText(MusicPlayActivity.this, "네트워크 연결이 불안정합니다.", Toast.LENGTH_SHORT).show();
                        }
                    });
        });

        skipPreviousBtn.setOnClickListener(v -> {
            musicService.skipPreviousMusic(music.getId())
                    .enqueue(new Callback<Music>() {
                        @Override
                        public void onResponse(Call<Music> call, Response<Music> response) {
                            music = response.body();
                            setData(music);
                            setExoPlayer();
                        }

                        @Override
                        public void onFailure(Call<Music> call, Throwable t) {
                            Toast.makeText(MusicPlayActivity.this, "네트워크 연결이 불안정합니다.", Toast.LENGTH_SHORT).show();
                        }
                    });
        });
    }

    private void setExoPlayer() {
        simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        playerControlView = binding.playerControlView;

        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this,
                Util.getUserAgent(this, "MelonTube"));

        musicService.playMusic(music.getTitle())
                .enqueue(new Callback<Music>() {
                    @Override
                    public void onResponse(Call<Music> call, Response<Music> response) {
                        MediaSource mediaSource =
                                new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(response.body().getAudioUrl()));

                        playerControlView.setPlayer(simpleExoPlayer);

                        simpleExoPlayer.setPlayWhenReady(true);
                        simpleExoPlayer.prepare(mediaSource);
                    }

                    @Override
                    public void onFailure(Call<Music> call, Throwable t) {

                    }
                });
    }

}