package com.example.approject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class FYPracticalquestion extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fypracticalquestion);

        Button openDriveButton = findViewById(R.id.btn1);
        Button openDriveButton1 = findViewById(R.id.btn2);
        openDriveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleDrive();
            }

            private void openGoogleDrive() {


                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.docs");

                // Create an intent to open the PDF file in a web browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1TW37PCfCKZyYGREdM4m-eKccdSulo99N/view?usp=sharing"));
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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1XMqfHg2aZyDCv-iqnUCL49PYq5yxbjSG/view?usp=sharing"));
                startActivity(browserIntent);



            }
        });

    }
}