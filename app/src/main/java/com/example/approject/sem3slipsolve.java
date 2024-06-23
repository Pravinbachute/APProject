package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem3slipsolve extends AppCompatActivity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3slipsolve);

        Button openDriveButton = findViewById(R.id.ajbtn1);
        Button openDriveButton1 = findViewById(R.id.dsbtn2);
        Button openDriveButton2 = findViewById(R.id.bdbtn3);



        openDriveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ZYtGhv07WNTu3QDixZXvch9F27wmlN9F/view?usp=sharing"));
                startActivity(browserIntent);


            }
        });
        openDriveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Px9aJu5NqvcYTFT0qzd6iZGB4MspI86P/view?usp=sharing"));
                startActivity(browserIntent);


            }
        });
        openDriveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1k7ElOY317fn-NahR7BN3dqA41soP6uJ-/view?usp=sharing"));
                startActivity(browserIntent);


            }
        });
    }
}