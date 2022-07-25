package com.example.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder> {
    private List<Review> reviews = new ArrayList<>();

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.review_item, parent,false);

        return new ReviewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewHolder holder, int position) {
        Review review = reviews.get(position);
        holder.textViewReview.setText(review.getReview());
        holder.textViewAuthor.setText(review.getName());

        String type  = review.getTypeReview();
        int backgroundId;
        if (type.equals("Позитивный")) {
            backgroundId = android.R.color.holo_green_light;
        }
        else if (type.equals("Нейтральный")) {
            backgroundId = android.R.color.holo_orange_light;
        }
        else {
            backgroundId = android.R.color.holo_red_light;
        }
        int color = ContextCompat.getColor(holder.itemView.getContext(), backgroundId);
        holder.linearLayoutReview.setBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    static class ReviewsViewHolder extends RecyclerView.ViewHolder {

        private final LinearLayout linearLayoutReview;
        private final TextView textViewReview;
        private final TextView textViewAuthor;


        public ReviewsViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayoutReview = itemView.findViewById(R.id.linearLayoutReview);
            textViewReview = itemView.findViewById(R.id.textViewReview);
            textViewAuthor = itemView.findViewById(R.id.textViewAuthor);
        }
    }
}
