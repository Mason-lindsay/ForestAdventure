package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContinueDownPath1 extends AppCompatActivity {

    private Button btnHut;
    private Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_down_path1);

        btnHut = findViewById(R.id.btn_hut);
        btnContinue = findViewById(R.id.btn_continue1);

        Intent intentHut = new Intent(ContinueDownPath1.this,Hut.class);
        Intent intentContinue = new Intent(ContinueDownPath1.this,ContinueDownPath2.class);

        btnHut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentHut);
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentContinue);
            }
        });
    }
}