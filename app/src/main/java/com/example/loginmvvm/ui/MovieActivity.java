package com.example.loginmvvm.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.loginmvvm.R;
import com.example.loginmvvm.data.response.MovieResponse;

public class MovieActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        getListMovie();
    }

    private void getListMovie(){
        movieViewModel.getlMovieResponseLiveData().observe(this, movieResponse -> {

            if(movieResponse != null){
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(0).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(1).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(2).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(3).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(4).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(5).getOriginalTitle());
                Log.d("Response","getListMovie " + movieResponse.getMovieResults().get(6).getOriginalTitle());
            }

        });
    }
}
