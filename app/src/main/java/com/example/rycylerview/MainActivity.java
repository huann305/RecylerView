package com.example.rycylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rycylerview.adapter.ListDataAdapter;
import com.example.rycylerview.adapter.MyAdapter;
import com.example.rycylerview.adapter.ShortsAdapter;
import com.example.rycylerview.model.Item;
import com.example.rycylerview.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recylerView);
        RecyclerView test = findViewById(R.id.test);
        List<Item> itemsVertical = new ArrayList<>();

        itemsVertical.add(new Item(R.drawable.a, "[Playlist speed up]\uD83D\uDD25relax.., cứ bắt anh hứa là phải yêu em suốt....", R.drawable.h, "100N", "VieTalents", "1"));
        itemsVertical.add(new Item(R.drawable.b, "Speed Up 2023 ※ Mình Sẽ Bỏ Cậu Ở Lại Với Kỉ Niệm Nhé? ", R.drawable.h, "200N", "Vũ Bá Huấn", "5"));
        itemsVertical.add(new Item(R.drawable.c, "thương em khi mùa thu thương em sang mùa hạ (lofi Ver) ", R.drawable.h, "120N", "VieTalents", "1"));
        itemsVertical.add(new Item(R.drawable.d, "Nothing On Me Remix - Making My Way Remix TikTok", R.drawable.h, "10N", "VieTalents", "1"));
//        RecyclerView.Adapter verticalAdapter = new ShortsAdapter(itemsVertical);

        List<Item> itemsHorizontal = new ArrayList<>();
        itemsHorizontal.add(new Item(R.drawable.e, "Check", R.drawable.h, "20N", "VieTalents", "1"));
        itemsHorizontal.add(new Item(R.drawable.f, "Check", R.drawable.h, "123N", "VieTalents", "1"));
        itemsHorizontal.add(new Item(R.drawable.g, "Check", R.drawable.h, "1M", "VieTalents", "1"));
        itemsHorizontal.add(new Item(R.drawable.h, "Check", R.drawable.h, "1,2N", "VieTalents", "1"));
//        RecyclerView.Adapter horizontalAdapter = new ShortsAdapter(itemsHorizontal);

        List<ListData> listData = new ArrayList<>();
        listData.add(new ListData(ListDataAdapter.TYPE_HORIZONTAL, itemsHorizontal, null));
        listData.add(new ListData(ListDataAdapter.TYPE_VERTICAL, null, itemsVertical));
        listData.add(new ListData(ListDataAdapter.TYPE_HORIZONTAL, itemsHorizontal, null));
        listData.add(new ListData(ListDataAdapter.TYPE_VERTICAL, null, itemsVertical));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyAdapter(itemsVertical));

        test.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        test.setAdapter(new ShortsAdapter(itemsHorizontal));

//        ListDataAdapter listDataAdapter = new ListDataAdapter();
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//        listDataAdapter.setData(this, listData);
//        recyclerView.setAdapter(listDataAdapter);
    }
}