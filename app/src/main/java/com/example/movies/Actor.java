package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Actor {

    @SerializedName("name")
    private String name;

    @SerializedName("photo")
    private String photoUrl;

    public Actor(String name, String photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }


}
