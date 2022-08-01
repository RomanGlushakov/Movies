package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActorResponse {

    @SerializedName("persons")
    private List<Actor> persons;

    public ActorResponse(List<Actor> persons) {
        this.persons = persons;
    }

    public List<Actor> getPersons() {
        return persons;
    }


}
