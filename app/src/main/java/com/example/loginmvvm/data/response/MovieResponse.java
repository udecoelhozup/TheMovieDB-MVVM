package com.example.loginmvvm.data.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.loginmvvm.data.model.MovieResults;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse implements Parcelable {
    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPage;
    @SerializedName("results")
    private List<MovieResults> movieResults;

    public MovieResponse() {
    }

    public MovieResponse(int page, int totalResults, int totalPage, List<MovieResults> movieResults) {
        this.page = page;
        this.totalResults = totalResults;
        this.totalPage = totalPage;
        this.movieResults = movieResults;
    }

    protected MovieResponse(Parcel in) {
        page = in.readInt();
        totalResults = in.readInt();
        totalPage = in.readInt();
        movieResults = in.createTypedArrayList(MovieResults.CREATOR);
    }

    public static final Creator<MovieResponse> CREATOR = new Creator<MovieResponse>() {
        @Override
        public MovieResponse createFromParcel(Parcel in) {
            return new MovieResponse(in);
        }

        @Override
        public MovieResponse[] newArray(int size) {
            return new MovieResponse[size];


        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(page);
        dest.writeInt(totalResults);
        dest.writeInt(totalPage);
        dest.writeTypedList(movieResults);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<MovieResults> getMovieResults() {
        return movieResults;
    }

    public void setMovieResults(List<MovieResults> movieResults) {
        this.movieResults = movieResults;
    }
}
