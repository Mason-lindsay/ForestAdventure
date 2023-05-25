package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForestPath extends AppCompatActivity {

    private Button btnLeft;
    private  Button btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest_path);

        btnLeft = findViewById(R.id.btn_left);
        btnRight = findViewById(R.id.btn_right);

        Intent intentLeft = new Intent(ForestPath.this, NeverEndingLoop.class);
        Intent intentRight = new Intent(ForestPath.this, ContinueDownPath1.class);

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRight);
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentLeft);
            }
        });
    }
}