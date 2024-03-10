package com.example.pract2;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcomeTextView = findViewById(R.id.orient);
        welcomeTextView.setText(getString(R.string.orientation));
        Log.i("MyActivity", "Created");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MyActivity", "Destroyed");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MyActivity", "Started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MyActivity", "Resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MyActivity", "Paused");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MyActivity", "Stopped");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState called");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "OnRestoreInstanceState called");
    }
}