package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionPaper extends AppCompatActivity {

    Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_paper);

        button=findViewById(R.id.quefy);
        button1=findViewById(R.id.quesy);
        button2=findViewById(R.id.quety);

        Button openDriveButton = findViewById(R.id.quefy);
        openDriveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xF7vd8-p2r7cHP1xuTgRTThmtr2upda2/view?usp=drive_link"));
                startActivity(browserIntent);

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaper.this, Exastudies.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaper.this, SYquestion.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionPaper.this, TYquestion.class);
                startActivity(intent);
            }
        });
    }
}