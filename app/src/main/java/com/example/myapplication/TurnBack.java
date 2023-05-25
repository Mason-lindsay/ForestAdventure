package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurnBack extends AppCompatActivity {

    private Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_back);

        btnRestart = findViewById(R.id.btn_restart);

        Intent  intentRestart = new Intent(TurnBack.this,MainActivity.class);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRestart);
            }
        });
    }
}