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

    public void setAlbumImageUrl(String albumImageUrl) {
        this.albumImageUrl = albumImageUrl;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumSinger() {
        return albumSinger;
    }

    public void setAlbumSinger(String albumSinger) {
        this.albumSinger = albumSinger;
    }

    public List<Music> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Music> trackList) {
        this.trackList = trackList;
    }
}
