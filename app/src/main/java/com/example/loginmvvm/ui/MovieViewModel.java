package com.example.loginmvvm.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.loginmvvm.data.response.MovieResponse;
import com.example.loginmvvm.util.Constants;

public class MovieViewModel extends AndroidViewModel {

    private MovieRepository mMovieRepository;
    private LiveData<MovieResponse> lMovieResponseLiveData;


    public MovieViewModel(@NonNull Application application) {
        super(application);
        mMovieRepository = new MovieRepository();
        this.lMovieResponseLiveData = mMovieRepository.getMovie(Constants.API_KEY, "pt-BR");
    }

    public LiveData<MovieResponse> getlMovieResponseLiveData() {

        return lMovieResponseLiveData;
    }
}
