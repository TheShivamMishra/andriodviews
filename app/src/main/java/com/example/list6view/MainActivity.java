package com.example.list6view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lisview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lisview=(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hola");
        arrayList.add("namaste");
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hola");
        arrayList.add("namaste");arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hola");
        arrayList.add("namaste");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1, arrayList);
        lisview.setAdapter(arrayAdapter);




    }

}
