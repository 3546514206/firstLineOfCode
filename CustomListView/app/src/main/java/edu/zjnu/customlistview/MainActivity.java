package edu.zjnu.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        构造好数据
        initFruits();

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruits);
        ListView view = findViewById(R.id.listView);
        view.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("apple");
        fruits.add(apple);
        Fruit banana = new Fruit("banana");
        fruits.add(banana);
        Fruit grape = new Fruit("grape");
        fruits.add(grape);
        Fruit common = new Fruit("common");
        fruits.add(common);
        Fruit lemon = new Fruit("lemon");
        fruits.add(lemon);
        Fruit mulberry = new Fruit("mulberry");
        fruits.add(mulberry);
    }
}