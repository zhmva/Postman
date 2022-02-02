package com.example.postman.ui.posts;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.postman.databinding.ItemPostBinding;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter {

    List<>


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.onBind();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected class PostViewHolder extends RecyclerView.ViewHolder{

        private ItemPostBinding binding;

        public PostViewHolder(@NonNull ItemPostBinding binding) {
            super(binding.getRoot());
        }
    }
}
