package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Book> fruitList=new ArrayList<Book>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        BookAdapter fruitAdapter=new BookAdapter(fruitList);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruits() {

            Book apple=new Book("Apple",R.mipmap.ic_launcher_round,"heeh","zheshiyibenhenniubideshu");
            fruitList.add(apple);
            Book banana=new Book("Banana",R.mipmap.ic_launcher,"saddf","zheshiyibenhenniubideshu");
            fruitList.add(banana);
            Book orange=new Book("Orange",R.mipmap.ic_launcher,"asdgzxc","zheshiyibenhenniubideshu");
            fruitList.add(orange);
}
}
