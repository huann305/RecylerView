package com.example.rycylerview.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rycylerview.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;
    ImageView avatar;
    TextView view;
    TextView channelName;
    TextView time;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imgImage);
        textView = itemView.findViewById(R.id.txtTitle);
        avatar = itemView.findViewById(R.id.imageAvatar);
        view = itemView.findViewById(R.id.txtView);
        channelName = itemView.findViewById(R.id.txtChannelName);
        time = itemView.findViewById(R.id.txtTime);
    }
}
