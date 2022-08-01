package com.example.movies;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ActorsAdapter extends  RecyclerView.Adapter<ActorsAdapter.ActorsViewHolder>{

    private List<Actor> actors = new ArrayList<>();


    public void setActors(List<Actor> actors) {
        this.actors = actors;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ActorsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.actor_item, parent, false);
        return new ActorsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActorsViewHolder holder, int position) {

        Log.d("AdapterMovie", "Position" + position);

        Actor actor = actors.get(position);

        Glide.with(holder.itemView).
                load(actor.getPhotoUrl()).
                into(holder.imageViewActor);

        holder.textViewActorName.setText(actor.getName());


    }

    @Override
    public int getItemCount() {
        return actors.size();
    }

    static class ActorsViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewActor;
        private TextView textViewActorName;

        public ActorsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewActor = itemView.findViewById(R.id.imageViewActor);
            textViewActorName = itemView.findViewById(R.id.textViewActorName);
        }
    }


}
