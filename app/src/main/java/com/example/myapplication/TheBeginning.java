package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TheBeginning extends AppCompatActivity {

    private Button btnCave;
    private Button btnForestPath;
    private Button btnTemple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_beginning);

        btnCave = findViewById(R.id.btn_cave);
        btnForestPath = findViewById(R.id.btn_forest_path);
        btnTemple = findViewById(R.id.btn_temple);
        Intent cavePressed = new Intent(TheBeginning.this, Cave.class);
        Intent forestPathPressed = new Intent(TheBeginning.this, ForestPath.class);
        Intent templePressed = new Intent(TheBeginning.this, Temple.class );

        btnCave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(cavePressed);
            }
        });

        btnForestPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(forestPathPressed);
            }
        });

        btnTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(templePressed);
            }
        });
    }
}