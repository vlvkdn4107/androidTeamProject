package com.example.melontubeproject.repository;

import com.example.melontubeproject.models.Data;
import com.example.melontubeproject.models.Music;
import com.example.melontubeproject.utils.Define;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MusicService {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Define.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("/musiclist")
    Call<Data> getMusicList();
}
