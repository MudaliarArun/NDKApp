package com.test.ndkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, getMsgFromJni(), Toast.LENGTH_SHORT).show();
    }
    public native String getMsgFromJni();
    static {
        System.loadLibrary("hello-android-jni");
    }
}
