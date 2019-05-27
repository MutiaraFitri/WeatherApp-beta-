package com.example.belajar_login_cantik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KotaAdapter adapter;
    private ArrayList<Kota> kotaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new KotaAdapter(kotaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CityActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    void addData(){
        kotaArrayList = new ArrayList<>();
        kotaArrayList.add(new Kota("Dimas Maulana", "1414370309", "123456789"));
        kotaArrayList.add(new Kota("Fadly Yonk", "1214234560", "987654321"));
        kotaArrayList.add(new Kota("Ariyandi Nugraha", "1214230345", "987648765"));
        kotaArrayList.add(new Kota("Aham Siswana", "1214378098", "098758124"));
    }
}
