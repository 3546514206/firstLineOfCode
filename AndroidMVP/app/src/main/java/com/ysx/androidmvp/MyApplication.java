package com.ysx.androidmvp;

import android.app.Application;
import android.content.Context;


public class MyApplication extends Application {

    public static final String SP_NAME = "com.ysx.androidmvp";
    public static Context sContext;


    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
