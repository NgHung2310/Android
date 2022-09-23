package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnExit;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExit = (Button)findViewById(R.id.btnExit);
        btnExit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );
        btnNext = (Button)findViewById(R.id.btnNext);
        btnNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i =new Intent(MainActivity.this,Activity2.class);
                        startActivity(i);
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getClass().getName(),"starttttttt");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getClass().getName(),"restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getName(),"Bi huy");
    }
}