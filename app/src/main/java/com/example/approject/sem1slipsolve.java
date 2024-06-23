package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem1slipsolve extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1slipsolve);

        Button openDriveButton = findViewById(R.id.cbtn);
        Button openDriveButton1 = findViewById(R.id.dbbtn);


        openDriveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fBSwqcucoH8mG01k0U12DHwJTyWuTyKj/view?usp=sharing"));
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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1PQC2AOCP9KYNjtT7QkYD0d0q6qB9pU4U/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
    }
}