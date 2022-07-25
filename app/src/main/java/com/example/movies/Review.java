package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Review {
    @SerializedName("author")
    private String name;
    @SerializedName("type")
    private String typeReview;
    @SerializedName("review")
    private String review;

    public Review(String name, String typeReview, String review) {
        this.name = name;
        this.typeReview = typeReview;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getTypeReview() {
        return typeReview;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "name=" + name +
                ", typeReview='" + typeReview + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
