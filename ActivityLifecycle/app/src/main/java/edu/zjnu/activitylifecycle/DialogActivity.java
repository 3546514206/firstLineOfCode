package edu.zjnu.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    public static final String TAG_DialogActivity = "DialogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG_DialogActivity,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onStart() {
        Log.i(TAG_DialogActivity,"onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG_DialogActivity,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG_DialogActivity,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG_DialogActivity,"onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG_DialogActivity,"onDestroy");
        super.onDestroy();
    }
}