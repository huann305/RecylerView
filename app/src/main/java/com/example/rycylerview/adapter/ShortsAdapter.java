package com.example.rycylerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rycylerview.R;
import com.example.rycylerview.model.Item;

import java.util.List;

public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.ShortsViewHolder>{

    List<Item> items;

    public ShortsAdapter(List<Item> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public ShortsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShortsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shorts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShortsViewHolder holder, int position) {
        holder.txtTitleShort.setText(items.get(position).getTitle());
        holder.imgViewShort.setImageResource(items.get(position).getImage());
        holder.txtViewShort.setText(items.get(position).getView());
    }

    @Override
    public int getItemCount() {
        if(items == null) return 0;
        return items.size();
    }

    public class ShortsViewHolder extends RecyclerView.ViewHolder{

        ImageView imgViewShort;
        TextView txtTitleShort;
        TextView txtViewShort;
        public ShortsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgViewShort = itemView.findViewById(R.id.imgShorts);
            txtTitleShort = itemView.findViewById(R.id.txtTitleShorts);
            txtViewShort = itemView.findViewById(R.id.txtViewShorts);
        }
    }
}
