package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=XV8WR69-PEBMFSV-PQ9MZEE-4WTETSA&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=XV8WR69-PEBMFSV-PQ9MZEE-4WTETSA&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("https://api.kinopoisk.dev/review?token=XV8WR69-PEBMFSV-PQ9MZEE-4WTETSA&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);




}
