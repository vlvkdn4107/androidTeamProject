package com.example.melontubeproject.models;

import java.io.Serializable;
import java.util.List;

public class Album implements Serializable {

    private String albumTitle;
    private String albumSinger;
    private String albumImageUrl;
    private List<Music> trackList;

    public String getAlbumImageUrl() {
        return albumImageUrl;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumSinger() {
        return albumSinger;
    }

    public List<Music> getTrackList() {
        return trackList;
    }

}
