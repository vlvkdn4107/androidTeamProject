package com.example.melontubeproject.models;

public class Music {

    private int rank;
    private String title;
    private String singer;
    private String imageUrl;
    private String lyrics;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getElbumImageUrl() {
        return imageUrl;
    }

    public void setElbumImageUrl(String elbumImageUrl) {
        this.imageUrl = elbumImageUrl;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
