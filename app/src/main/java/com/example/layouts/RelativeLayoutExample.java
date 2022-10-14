package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Button buttonMain = findViewById(R.id.btnToMain);
        buttonMain.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        Button buttonLinear = findViewById(R.id.btnToLinear);
        buttonLinear.setOnClickListener(view -> {
            Intent intent = new Intent(this, LinearLayoutExample.class);
            startActivity(intent);
        });
    }
}
