package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cave extends AppCompatActivity {

    private Button btnContinue;
    private Button btnTurnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cave);

        btnContinue = findViewById(R.id.btn_continue);
        btnTurnBack = findViewById(R.id.btn_turn_back);

        Intent intentContinue = new Intent(Cave.this, Continue.class );
        Intent intentTurnBack = new Intent(Cave.this,TurnBack.class);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentContinue);
            }
        });

        btnTurnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentTurnBack);
            }
        });
    }
}