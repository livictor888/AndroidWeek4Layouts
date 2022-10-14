package com.example.layouts;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GridLayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridLayout gridLayout1 = findViewById(R.id.grid_layout1);
        gridLayout1.setRowCount(10);
        gridLayout1.setColumnCount(10);
        int[] ids = new int[100];
        Random random = new Random();
        for(int i=0; i<gridLayout1.getRowCount(); i++) {
            for(int j=0; j<gridLayout1.getColumnCount(); j++) {
//               if(!(i==5 && j>6 && j<9) && !(i==6 && j>5 && j<9)) {
                    TextView textView = new TextView(this);
                    String text = i + "-" + j;
                    int index = i*gridLayout1.getRowCount()+j;
                    ids[index] = View.generateViewId();
                    textView.setId(ids[index]);
                    textView.setText(text);
                    textView.setWidth(100);
                    textView.setHeight(100);
//                    if (i == 5 && j == 6) {
//                        textView.setWidth(300);
//                        textView.setHeight(200);
//                    }
                    textView.setGravity(Gravity.CENTER);
                    textView.setBackgroundColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
                    gridLayout1.addView(textView);
//                }
            }
        }
        gridLayout1.setForegroundGravity(Gravity.CENTER);
//        View child = findViewById(ids[5*gridLayout1.getRowCount()+6]);
//        GridLayout.LayoutParams params = new GridLayout.LayoutParams(child.getLayoutParams());
//        params.rowSpec = GridLayout.spec(5,2);
//        params.columnSpec = GridLayout.spec(6, 3);
//        child.setLayoutParams(params);


        Button toLinearLayout = findViewById(R.id.btnToLinear);
        toLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, LinearLayoutExample.class);
            startActivity(intent);
        });

        Button toTableLayout = findViewById(R.id.btnToTable);
        toTableLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, TableLayoutExample.class);
            startActivity(intent);
        });
    }
}