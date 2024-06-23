package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    CardView cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView openDriveButton = findViewById(R.id.cardView6);
        CardView openDriveButton1 = findViewById(R.id.cardView7);
        CardView openDriveButton2 = findViewById(R.id.cardView5);
        CardView openDriveButton3 = findViewById(R.id.cardView3);
        CardView openDriveButton4 = findViewById(R.id.V22);
        CardView openDriveButton5 = findViewById(R.id.cardView4);
        CardView openDriveButton6 = findViewById(R.id.cardView10);
        CardView openDriveButton7 = findViewById(R.id.cardView11);
        CardView openDriveButton8 = findViewById(R.id.cardView12);


        openDriveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1L7kQZAkimkPXyqaK0ts2u1JyztcM2WrT/view?usp=sharing"));
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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rgQa3R0dKwKCQjlfaDCB9-2D8GhVGOpD/view?usp=sharing"));
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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16bBsSM70Mrt_Dqfy4vsjMUPD7P30ej22/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Dw_Rrsi_GJDxZtWAVaX5pHsQPxpwFT30/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1syXTQv9vqYGxQFi_defUrDeKVkqkgTBR/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1rUQya9abZ2I0xY1smry_HCGvJADYl1T6/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nKhhN9ZcYAt7QIz89ZkEcfm-2xvboejf/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dm-iBvm0dQPi5jJ-qR68OAiEwqyZERzV/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });
        openDriveButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yedb-RcaB8r7YMArC0d62P0PtK5SdbBy/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });


    }
}