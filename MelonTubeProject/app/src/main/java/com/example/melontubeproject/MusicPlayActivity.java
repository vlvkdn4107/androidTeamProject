package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.databinding.ActivityMusicPlayBinding;
import com.example.melontubeproject.models.Music;

public class MusicPlayActivity extends AppCompatActivity {

    private Music music;
    private ActivityMusicPlayBinding binding;

    private boolean isVisibleLyrics = false;

    private ImageView elbumImage;
    private TextView lyrics;
    private ScrollView scrollView;

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
        elbumImage = binding.elbumPlayImage;
        lyrics = binding.lyricsTextView;
        scrollView = binding.scrollView;

        elbumImage.setOnClickListener(v -> {
            scrollView.setVisibility(View.VISIBLE);
            lyrics.setText(music.getLyrics());
            Log.d(TAG, "가사 보이기");
        });

        lyrics.setOnClickListener(v -> {
            scrollView.setVisibility(View.GONE);
            Log.d(TAG, "가사 안보이기");

        });
    }
}