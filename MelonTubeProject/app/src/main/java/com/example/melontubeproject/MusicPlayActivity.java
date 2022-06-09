package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.databinding.ActivityMusicPlayBinding;
import com.example.melontubeproject.models.Music;

public class MusicPlayActivity extends AppCompatActivity {

    private Music music;
    private ActivityMusicPlayBinding binding;

    private boolean isVisibleLyrics = false;

    private final String TAG = MusicPlayActivity.class.toString();

    //public final String OBJ_NAME = "music";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMusicPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent() != null) {
            music = (Music) getIntent().getSerializableExtra("music");
            initData();
            showLyrics(music);
        }

    }

    private void initData() {
        binding.titlePlayText.setText(music.getTitle());
        binding.singerPlayText.setText(music.getSinger());

        Glide.with(this)
                .load(music.getImageUrl())
                .into(binding.elbumPlayImage);

    }

    // 앨범 커버 클릭시 가사 출력 -> 재클릭시 다시 커버
    private void showLyrics(Music music) {
        ImageView elbumImage = binding.elbumPlayImage;
        TextView lyrics = binding.lyricsTextView;

        elbumImage.setOnClickListener(v -> {
            if (isVisibleLyrics) {
                binding.scrollView.setVisibility(View.INVISIBLE);
                isVisibleLyrics = false;
            } else {
                binding.scrollView.setVisibility(View.VISIBLE);
                lyrics.setText(music.getLyrics());
                lyrics.setVisibility(View.VISIBLE);
                isVisibleLyrics = true;
                Log.d(TAG, "View.VISIBLE");
            }

        });
    }
}