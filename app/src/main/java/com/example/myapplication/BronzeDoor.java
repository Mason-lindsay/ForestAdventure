package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BronzeDoor extends AppCompatActivity {

    private Button treasureRoom;
    private Button box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronze_door);

        treasureRoom = findViewById(R.id.btn_treasure_room);
        box = findViewById(R.id.btn_box);

        Intent intentTreasureRoom = new Intent(BronzeDoor.this,TreasureRoom.class);
        Intent intentBox = new Intent(BronzeDoor.this,Box.class);

        treasureRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentTreasureRoom);
            }
        });

        box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBox);
            }
        });
    }
}