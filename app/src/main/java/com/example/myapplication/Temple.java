package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Temple extends AppCompatActivity {

    private Button rollDie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);

        rollDie = findViewById(R.id.roll_die);

        Intent intentUnlucky = new Intent(Temple.this, Lost.class);
        Intent intentLucky = new Intent(Temple.this, Lucky.class);
        rollDie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int luck = (int)(Math.random() * 4);
                if(luck != 2){
                    startActivity(intentUnlucky);
                }
                else{
                    startActivity(intentLucky);
                }
            }
        });
    }
}