package com.example.rycylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
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
        return items.size();
    }
}
