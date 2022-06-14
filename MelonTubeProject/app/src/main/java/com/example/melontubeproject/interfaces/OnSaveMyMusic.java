package com.example.melontubeproject.interfaces;

import android.content.Context;

import com.example.melontubeproject.models.Music;

import java.util.List;

public interface OnSaveMyMusic {
    List<Music> getSaveMyMusicList(Context context, String key);
}
