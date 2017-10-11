package com.gohool.myrv.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


String hospital[]={"Katrina",
        "Madhuri","1","2","3","4","5","6"

};

String drname[]={"a","b","c","d","e","f","g","h"};

        reciclerView = (RecyclerView) findViewById(R.id.reciclerView);
        reciclerView.setHasFixedSize(true);
        //every item has a fixed size
        reciclerView.setLayoutManager(new
                LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0; i<=7; i++) {
            ListItem listItem = new ListItem(
                    "Item " + hospital[i],
                    drname[i]

            );
            listItems.add(listItem);
        }

        adapter = new MyAdapter(this, listItems);

        reciclerView.setAdapter(adapter);

    }
}
