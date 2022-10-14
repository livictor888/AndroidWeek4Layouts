package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button buttonRelative = findViewById(R.id.btnToRelative);
        buttonRelative.setOnClickListener(view -> {
            Intent intent = new Intent(this, RelativeLayoutExample.class);
            startActivity(intent);
        });

        Button buttonGrid = findViewById(R.id.btnToGrid);
        buttonGrid.setOnClickListener(view -> {
            Intent intent = new Intent(this, GridLayoutExample.class);
            startActivity(intent);
        });
    }
}