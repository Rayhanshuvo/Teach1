package com.gohool.myrv.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter1;
import Model.ListItem1;

public class Go extends AppCompatActivity {

    private RecyclerView reciclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem1> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


       String hospital[]={"Katrin",
                "Madhur","1","2","3","4","5","6"

        };

        String drname[]={"b","a","c","d","e","f","g","h"};

        reciclerView = (RecyclerView) findViewById(R.id.reciclerView1);
        reciclerView.setHasFixedSize(true);
        //every item has a fixed size
        reciclerView.setLayoutManager(new
                LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0; i<=7; i++) {
            ListItem1 listItem = new ListItem1(
                    "Item " + hospital[i],
                    drname[i]

            );
            listItems.add(listItem);
        }

        adapter = new MyAdapter1(Go.this, listItems);
       // adapter = new uo(Go.this, listItems);
        reciclerView.setAdapter(adapter);

    }
}
