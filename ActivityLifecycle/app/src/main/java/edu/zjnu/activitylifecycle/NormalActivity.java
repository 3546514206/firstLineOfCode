package edu.zjnu.activitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class NormalActivity extends AppCompatActivity {

    public static final String TAG_NormalActivity = "NormalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG_NormalActivity, "onCreate");

        if (savedInstanceState != null) {
            Log.i(TAG_NormalActivity, "temp data is " + String.valueOf((Integer) savedInstanceState.get("data")));
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }


    @Override
    protected void onStart() {
        Log.i(TAG_NormalActivity, "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG_NormalActivity, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG_NormalActivity, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG_NormalActivity, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG_NormalActivity, "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i(TAG_NormalActivity, "onSaveInstanceState");

        Integer count = (Integer) outState.get("count");
        if (count == null) {
            count = 0;
        }

        outState.putInt("count", count);
        super.onSaveInstanceState(outState);
    }
}