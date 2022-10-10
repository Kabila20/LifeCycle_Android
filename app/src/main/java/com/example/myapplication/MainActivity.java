package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements MainActivity1 {
    private static final String MSG="WELCOME TO MSF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MSG, "onCreate Method");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MSG, "onStart Method");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MSG, "onStop Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MSG,"onResume Method");

    }

    @Override
    protected void onPause() {
        super.onPause();
  Log.i(MSG, "onPause Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MSG, "onDestroy Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MSG, "onRestart Method");
    }
}

