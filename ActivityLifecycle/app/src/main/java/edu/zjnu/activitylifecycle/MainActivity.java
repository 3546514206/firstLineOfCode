package edu.zjnu.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_MainActivity = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG_MainActivity,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button startNormalActivityButton = findViewById(R.id.startNormalActivity);
        Button startDialogActivityButton = findViewById(R.id.startDialogActivity);

        startDialogActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

        startNormalActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        Log.i(TAG_MainActivity,"onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG_MainActivity,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG_MainActivity,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG_MainActivity,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG_MainActivity,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG_MainActivity,"onRestart");
        super.onRestart();
    }
}