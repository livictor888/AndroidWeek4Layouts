package com.example.layouts;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TableLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        TableLayout tableLayout1 = findViewById(R.id.table_layout1);
        Random random = new Random();
        for(int i=0; i<10; i++) {
            TableRow tableRow = new TableRow(this);
            for(int j=0; j<10; j++) {
                TextView textView = new TextView(this);
                String text = i + "-" + j;
                textView.setText(text);
                textView.setWidth(100);
                textView.setHeight(100);
                textView.setGravity(Gravity.CENTER);
                textView.setBackgroundColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));

                tableRow.addView(textView);
            }
            tableLayout1.addView(tableRow);
        }
        tableLayout1.setForegroundGravity(Gravity.CENTER);

        Button toGridLayout = findViewById(R.id.btnToGrid);
        toGridLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, GridLayoutExample.class);
            startActivity(intent);
        });

        Button toTableLayout2 = findViewById(R.id.btnToTable2);
        toTableLayout2.setOnClickListener(view -> {
            Intent intent = new Intent(this, TableLayoutExample2.class);
            startActivity(intent);
        });
    }
}
