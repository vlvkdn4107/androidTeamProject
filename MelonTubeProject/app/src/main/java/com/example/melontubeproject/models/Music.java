package com.example.melontubeproject.models;

import java.io.Serializable;
import java.util.List;

public class Music implements Serializable {

    private int id;
    private String title;
    private String singer;
    private String albumTitle;
    private String audioUrl;
    private String imageUrl;
    private String lyrics;

    private List<Music> musicList;

    public String getAudioUrl() {
        return audioUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLyrics() {
        return lyrics;
    }


}
