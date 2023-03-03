package edu.zjnu.listviewsample;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999"
            , "1234", "3456", "6789", "1456", "0987", "3719", "1830", "2683"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> array = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        ListView view = findViewById(R.id.listView);
        view.setAdapter(array);
    }

}