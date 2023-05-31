package com.example.rycylerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rycylerview.model.Item;
import com.example.rycylerview.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<Item> items;

    public MyAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(items.get(position).getTitle());
        holder.imageView.setImageResource(items.get(position).getImage());
        holder.avatar.setImageResource(items.get(position).getAvatar());
        holder.view.setText(items.get(position).getView());
        holder.channelName.setText(items.get(position).getChannelName());
        holder.time.setText(items.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        if(items == null) return 0;
        return items.size();
    }
}
