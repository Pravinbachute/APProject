package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FYsemester extends AppCompatActivity {

        Button button1, button2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fysemester);

            button1=findViewById(R.id.btn1);
            button2=findViewById(R.id.btn2);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FYsemester.this, sem1notes.class);
                    startActivity(intent);
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FYsemester.this, sem2notes.class);
                    startActivity(intent);
                }
            });

//            final Button button1 = findViewById(R.id.btn1);
//
////            button2 =findViewById(R.id.btn2);
////            button3 = findViewById(R.id.btn3);
//
//            button1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    openPDF("https://drive.google.com/file/d/1xF7vd8-p2r7cHP1xuTgRTThmtr2upda2/view?usp=drive_link");
//                }
//            });
//
//            button2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    openPDF("https://drive.google.com/file/d/2xF7vd8-p2r7cHP1xuTgRTThmtr2upda2/view?usp=drive_link");
//                }
//            });
//
////            button3.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View v) {
////                    openPDF("https://drive.google.com/file/d/3xF7vd8-p2r7cHP1xuTgRTThmtr2upda2/view?usp=drive_link");
////                }
////            });
//        }
//
//    private void openPDF(String url) {
//        // Open the PDF in a web browser
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        startActivity(browserIntent);
//    }


//        private void openPDF(String url) {
//            // Check if Google Drive app is installed
//            Intent driveIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");
//            if (driveIntent != null) {
//                // Google Drive app is installed, open PDF in Google Drive
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//            } else {
//                // Google Drive app is not installed, open PDF in a web browser
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(browserIntent);
//            }
//        }
        }
    }

