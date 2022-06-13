package com.example.melontubeproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.databinding.ActivityMusicPlayBinding;
import com.example.melontubeproject.databinding.CustomExoViewBinding;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.repository.MusicService;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MusicPlayActivity extends AppCompatActivity {

    private Music music;
    private ActivityMusicPlayBinding binding;
    private MusicService musicService;

    private SimpleExoPlayer simpleExoPlayer;
    private PlayerControlView playerControlView;
    private DefaultTimeBar timeBar;

    private ImageButton playBtn;
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
            initData(music);
            showLyrics();
            addEventListener();
            playMusic();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        simpleExoPlayer.release();
    }

    private void initData(Music music) {
        binding.titlePlayText.setText(music.getTitle());
        binding.singerPlayText.setText(music.getSinger());
        binding.lyricsTextView.setText(music.getLyrics());
        binding.scrollView.setVisibility(View.INVISIBLE);

        Glide.with(this)
                .load(music.getImageUrl())
                .into(binding.elbumPlayImage);

    }

    // 앨범 커버 클릭시 가사 출력 -> 재클릭시 다시 커버
    private void showLyrics() {

        binding.elbumPlayImage.setOnClickListener(v -> {
            binding.scrollView.setVisibility(View.VISIBLE);
            Log.d(TAG, "가사 보이기");
        });

        binding.lyricsTextView.setOnClickListener(v -> {
            binding.scrollView.setVisibility(View.GONE);
            Log.d(TAG, "가사 안보이기");
        });
    }

    private void addEventListener() {
        // 다음 노래 재생 버튼 클릭
        playBtn = findViewById(R.id.playMusicBtn);
        skipNextBtn = findViewById(R.id.skipNextBtn);
        skipPreviousBtn = findViewById(R.id.skipPreviousBtn);

        skipNextBtn.setOnClickListener(v -> {
            musicService.skipNextMusic(music.getId())
                    .enqueue(new Callback<Music>() {
                        @Override
                        public void onResponse(Call<Music> call, Response<Music> response) {
                            music = response.body();
                            initData(music);
                            showLyrics();
                            playMusic();

                            Log.d(TAG, "다음 노래 재생 !!!!");
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
                            initData(music);
                            showLyrics();
                            playMusic();

                            Log.d(TAG, "이전 노래 재생 !!!!");
                        }

                        @Override
                        public void onFailure(Call<Music> call, Throwable t) {
                            Toast.makeText(MusicPlayActivity.this, "네트워크 연결이 불안정합니다.", Toast.LENGTH_SHORT).show();
                        }
                    });
        });

    }

    private void playMusic() {
        simpleExoPlayer = new SimpleExoPlayer.Builder(this).build();
        playerControlView = binding.playerControlView;
        timeBar = findViewById(R.id.exoPlayerTimeBar);

        timeBar.addListener(new TimeBar.OnScrubListener() {
            @Override
            public void onScrubStart(TimeBar timeBar, long position) {
                Log.d(TAG, "타임바 작동");
            }

            @Override
            public void onScrubMove(TimeBar timeBar, long position) {

            }

            @Override
            public void onScrubStop(TimeBar timeBar, long position, boolean canceled) {

            }
        });

        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this,
                Util.getUserAgent(this, "MelonTube"));

        musicService.playMusic(music.getTitle())
                .enqueue(new Callback<Music>() {
                    @Override
                    public void onResponse(Call<Music> call, Response<Music> response) {
                        MediaSource mediaSource =
                                new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(Uri.parse(response.body().getAudioUrl()));

                        if (simpleExoPlayer == null) {
                            playerControlView.setPlayer(simpleExoPlayer);
                        }
                        simpleExoPlayer.setPlayWhenReady(true);
                        simpleExoPlayer.prepare(mediaSource);
                        Log.d(TAG, "playMusic()");
                    }

                    @Override
                    public void onFailure(Call<Music> call, Throwable t) {

                    }
                });
    }
}