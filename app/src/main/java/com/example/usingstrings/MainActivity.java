package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg2 = findViewById(R.id.tvMsg2);
        textMsg2.setText(R.string.Msg2);
    }


        Log.i(tag:"LifeCycle", msg:"OnCreate called...");
}

    @Override
    protected void onStart() {
        super.onStart();


        log.i(tag: "LifeCycle", msg:"OnStart called...");
    }
    @Override
    protected void onResume() {
        super.onResume();

        log.i( tag:"LifeCycle", msg:"OnResume called...");
    }
    @Override
    protected void onPause() {
        super.onPause();

        log.i( tag:"LifeCycle", msg:"OnPause called...");
    }
    @Override
    protected void onStop() {
        super.onStop();

        log.i( tag:"LifeCycle", msg:"OnStop called...");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        log.i( tag:"LifeCycle", msg:"OnDestroy called...");
    }


