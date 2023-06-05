package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lucky extends AppCompatActivity {

    private Button btnBronzeDoor;
    private Button btnPlatinumDoor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);

        btnBronzeDoor = findViewById(R.id.btn_bronze_door);
        btnPlatinumDoor = findViewById(R.id.btn_platinum_door);

        Intent intentBronzeDoor = new Intent(Lucky.this,BronzeDoor.class);
        Intent intentPlatinumDoor = new Intent(Lucky.this,PlatinumDoor.class);

        btnPlatinumDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlatinumDoor);
            }
        });

        btnBronzeDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBronzeDoor);
            }
        });
    }
}