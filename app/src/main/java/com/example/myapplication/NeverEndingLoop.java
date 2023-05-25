package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NeverEndingLoop extends AppCompatActivity {

    private Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_never_ending_loop);

        restart = findViewById(R.id.btn_restart2);

        Intent intentRestart = new Intent(NeverEndingLoop.this, MainActivity.class);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRestart);
            }
        });
    }
}