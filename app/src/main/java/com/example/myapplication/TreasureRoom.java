package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TreasureRoom extends AppCompatActivity {

    private Button restart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure_room);

        restart = findViewById(R.id.btn_restart7);

        Intent intentRestart = new Intent(TreasureRoom.this, MainActivity.class);
    }
}