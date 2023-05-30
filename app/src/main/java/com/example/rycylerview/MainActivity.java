package com.example.rycylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recylerView);
        List<Item> items = new ArrayList<>();

        items.add(new Item(R.drawable.a, "[Playlist speed up]\uD83D\uDD25relax.., cứ bắt anh hứa là phải yêu em suốt....", R.drawable.h, "100N", "VieTalents", "1"));
        items.add(new Item(R.drawable.b, "Speed Up 2023 ※ Mình Sẽ Bỏ Cậu Ở Lại Với Kỉ Niệm Nhé? ", R.drawable.h, "200N", "Vũ Bá Huấn", "5"));
        items.add(new Item(R.drawable.c, "thương em khi mùa thu thương em sang mùa hạ (lofi Ver) ", R.drawable.h, "120N", "VieTalents", "1"));
        items.add(new Item(R.drawable.d, "Nothing On Me Remix - Making My Way Remix TikTok", R.drawable.h, "10N", "VieTalents", "1"));
        items.add(new Item(R.drawable.e, "Check", R.drawable.h, "20N", "VieTalents", "1"));
        items.add(new Item(R.drawable.f, "Check", R.drawable.h, "123N", "VieTalents", "1"));
        items.add(new Item(R.drawable.g, "Check", R.drawable.h, "1M", "VieTalents", "1"));
        items.add(new Item(R.drawable.h, "Check", R.drawable.h, "1,2N", "VieTalents", "1"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}