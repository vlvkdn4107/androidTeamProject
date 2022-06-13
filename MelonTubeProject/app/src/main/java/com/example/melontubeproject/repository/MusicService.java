package com.example.melontubeproject.repository;

import com.example.melontubeproject.models.Album;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.utils.Define;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MusicService {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Define.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("musiclist")
    Call<List<Music>> musicList();

    @GET("skipmusic/next")
    Call<Music> skipNextMusic(
            @Query("id") int id
    );

    @GET("skipmusic/previous")
    Call<Music> skipPreviousMusic(
            @Query("id") int id
    );

    @GET("albumlist/{albumTitle}")
    Call<Album> albumInfo(
            @Path("albumTitle") String albumTitle
    );

    @GET("albumlist")
    Call<List<Album>> albumMusicList();

    @GET("play")
    Call<Music> playMusic(
            @Query("musicTitle") String musicTitle
    );

    @POST("addmylist")
    Call<Music> addMyList(
            @Body Music music
    );

    @GET("searchlist")
    Call<List<Music>> getSearch(
            @Query("title") String title,
            @Query("singer") String singer
    );
}
