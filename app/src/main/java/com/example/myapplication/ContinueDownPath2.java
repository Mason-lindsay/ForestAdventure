package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContinueDownPath2 extends AppCompatActivity {

    private Button btnCrossBridge;
    private Button btnFollowPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_down_path2);

        btnFollowPath = findViewById(R.id.follow_path);
        btnCrossBridge = findViewById(R.id.cross_bridge);

        Intent intentFollowPath = new Intent(ContinueDownPath2.this, ContinueDownPath3.class);
        Intent intentCrossBridge = new Intent(ContinueDownPath2.this,CrossBridge.class);

        btnCrossBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentCrossBridge);
            }
        });

        btnFollowPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentFollowPath);
            }
        });

    }
}