package com.example.approject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    EditText edittextemail,edittextpassword;
    Button buttonlogin;
    FirebaseAuth mAuth;

    TextView textView;


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Toast.makeText(getApplicationContext(),"login sucussfull",Toast.LENGTH_LONG).show();
            Intent intent= new Intent(Login.this, MainHome.class);
            startActivity(intent);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edittextemail=findViewById(R.id.email);
        edittextpassword=findViewById(R.id.Password);
        mAuth=FirebaseAuth.getInstance();
        buttonlogin=findViewById(R.id.buttonLogin);

        textView=findViewById(R.id.txt1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Registration.class);
                startActivity(intent);
                finish();
            }
        });

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String email,password;
                email=String.valueOf(edittextemail.getText());
                password=String.valueOf(edittextpassword.getText());


                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Login.this,"enter email",Toast.LENGTH_LONG).show();
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Login.this,"enter password",Toast.LENGTH_LONG).show();
                    return;

                }


                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()) {

                                    Toast.makeText(getApplicationContext(),"login sucussfull",Toast.LENGTH_LONG).show();
                                    Intent intent= new Intent(Login.this,MainHome.class);
                                    startActivity(intent);
                                    finish();

                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(Login.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });


            }
        });

    }
}
