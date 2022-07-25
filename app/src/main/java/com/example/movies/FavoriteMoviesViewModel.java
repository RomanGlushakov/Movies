package com.example.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavoriteMoviesViewModel extends AndroidViewModel {

    private final MoviesDao movieDao;

    public FavoriteMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDataBase.getInstance(application).moviesDao();
    }

    public LiveData<List<Movie>> getMovies () {
        return movieDao.getAllFavoriteMovies();
    }
}
