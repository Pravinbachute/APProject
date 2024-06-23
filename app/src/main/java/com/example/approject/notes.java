package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notes extends AppCompatActivity {
    Button button,button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        button=findViewById(R.id.btn1);
        button1=findViewById(R.id.btn2);
        button2=findViewById(R.id.btn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notes.this, FYsemester.class);
                startActivity(intent);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notes.this, SYsemester.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notes.this, TYsemester.class);
                startActivity(intent);

            }
        });

    }
}