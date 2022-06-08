package com.example.melontubeproject.repository;

import com.example.melontubeproject.utils.Define;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
<<<<<<< Updated upstream
import retrofit2.http.GET;

public interface MusicService {
=======

public class MusicService {
>>>>>>> Stashed changes

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Define.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

<<<<<<< Updated upstream
    // TODO GET 메소드 작성
=======

>>>>>>> Stashed changes
}
