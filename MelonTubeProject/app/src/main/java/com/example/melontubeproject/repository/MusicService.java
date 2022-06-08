package com.example.melontubeproject.repository;

import com.example.melontubeproject.utils.Define;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MusicService {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Define.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    // TODO GET 메소드 작성
}
