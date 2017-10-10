package com.volianskyi.taras.a101017_baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvItemList = (ListView) findViewById(R.id.lvItemLiasMainActivity);
        ArrayList<Item> arrayList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Item newItem = new Item();
            newItem.setName("Product - " + i);
            newItem.setPrice("Price - " + i * 10);
            arrayList.add(newItem);
        }
        MyAdapter myAdapter = new MyAdapter(arrayList, this);
        lvItemList.setAdapter(myAdapter);
    }
}
