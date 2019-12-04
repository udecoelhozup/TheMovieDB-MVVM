package com.example.loginmvvm.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.loginmvvm.data.ApiService;
import com.example.loginmvvm.data.response.MovieResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {
    public LiveData<MovieResponse> getMovie(String apiKey, String language){
        final MutableLiveData <MovieResponse> movieResponseMutableLiveData = new MutableLiveData<>();
        ApiService.getInstance().getMovieResponse(apiKey, language).enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if(response.isSuccessful()){
                    movieResponseMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
            movieResponseMutableLiveData.setValue(null);
            }
        });

        return movieResponseMutableLiveData;
    }

}
