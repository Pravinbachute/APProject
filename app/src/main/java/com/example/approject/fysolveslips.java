package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fysolveslips extends AppCompatActivity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fysolveslips);

        button1 = findViewById(R.id.sem1btn);
        button2 = findViewById(R.id.sem2btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fysolveslips.this, sem1slipsolve.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fysolveslips.this, sem2slipsolve.class);
                startActivity(intent);
            }
        });
    }
}