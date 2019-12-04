package com.example.loginmvvm.data;

import com.example.loginmvvm.data.response.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MovieResponse> getMovieResponse(@Query("api_key") String apiKey, @Query("language") String language);

}
