package com.example.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TableLayoutExample2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);

        Button toTableLayout = findViewById(R.id.btnToTable);
        toTableLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, TableLayoutExample.class);
            startActivity(intent);
        });

        Button toRecyclerView = findViewById(R.id.btnToRecyclerView);
        toRecyclerView.setOnClickListener(view -> {
            Intent intent = new Intent(this, RecyclerViewExample.class);
            startActivity(intent);
        });
    }
}
