package com.example.belajar_login_cantik;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;

public class ScrollActivity extends AppCompatActivity {
    private CuacaAdapter adapter;
    private ArrayList<Kota> kotaArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("NAMA KOTA");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_viewDimas);

        adapter = new CuacaAdapter(kotaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ScrollActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    void addData(){
        kotaArrayList = new ArrayList<>();
        kotaArrayList.add(new Kota("Dimas Maulana", "1414370309", "123456789"));
        kotaArrayList.add(new Kota("Fadly Yonk", "1214234560", "987654321"));
        kotaArrayList.add(new Kota("Ariyandi Nugraha", "1214230345", "987648765"));
        kotaArrayList.add(new Kota("Aham Siswana", "1214378098", "098758124"));
    }
}
