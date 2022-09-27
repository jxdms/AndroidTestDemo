package com.example.androidappdemo1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidappdemo1.R;

public class MainActivity extends AppCompatActivity {

    private static final String Tag="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("---输出---");
        init();

        Log.i(Tag,"信息框提示");
    }

    public void init(){

        Log.d(Tag,"初始化");
    }
}