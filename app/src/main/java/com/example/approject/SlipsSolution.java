package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlipsSolution extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slips_solution);
        button1=findViewById(R.id.fybtn);
        button2=findViewById(R.id.sybtn);
        button3=findViewById(R.id.tybtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlipsSolution.this, fysolveslips.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlipsSolution.this, syslipsolution.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SlipsSolution.this, tyslipsolution.class);
                startActivity(intent);
            }
        });

    }
}