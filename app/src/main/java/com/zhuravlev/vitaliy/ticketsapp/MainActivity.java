package com.zhuravlev.vitaliy.ticketsapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Card> cards;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        initializeData();

        CardAdapter adapter = new CardAdapter(cards);
        recyclerView.setAdapter(adapter);
    }

    private void initializeData() {
        cards = new ArrayList<>();
        cards.add(new Card("Пристегните ремни", new Date(System.currentTimeMillis()), "ЛЕНИНГРАД ЦЕНТР (Малая сцена)", "описание", Color.RED));
        cards.add(new Card("Опера \"Царь Эдип\"", new Date(System.currentTimeMillis()), "Александринский театр", "описание", Color.GREEN));
        cards.add(new Card("Балет \"Золушка\"", new Date(System.currentTimeMillis()), "Александринский театр", "описание", Color.BLUE));
    }
}
