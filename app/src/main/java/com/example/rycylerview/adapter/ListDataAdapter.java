package com.example.rycylerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rycylerview.R;
import com.example.rycylerview.model.ListData;

import java.util.List;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListDataViewHolder> {

    public static final int TYPE_HORIZONTAL = 1;
    public static final int TYPE_VERTICAL = 2;

    private Context context;

    private List<ListData> mlistData;
    public void setData(Context context, List<ListData> listData){
        this.mlistData = listData;
        this.context = context;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return mlistData.get(position).getType();
    }

    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_data, parent, false);
        return new ListDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {
        ListData listData = mlistData.get(position);
        if(listData == null) return;

        if(TYPE_HORIZONTAL == holder.getItemViewType()){

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            MyAdapter myAdapter = new MyAdapter(listData.getItemsShorts());
            holder.rcvItem.setAdapter(myAdapter);
            
        } else if (TYPE_VERTICAL == holder.getItemViewType()) {

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            ShortsAdapter shortsAdapter = new ShortsAdapter(listData.getItems());
            holder.rcvItem.setAdapter(shortsAdapter);

        }
    }

    @Override
    public int getItemCount() {
        if(mlistData != null) return mlistData.size();
        return 0;
    }

    public class ListDataViewHolder extends RecyclerView.ViewHolder{

        RecyclerView rcvItem;

        public ListDataViewHolder(@NonNull View itemView) {
            super(itemView);
            rcvItem = itemView.findViewById(R.id.rcvItem);
        }
    }
}
