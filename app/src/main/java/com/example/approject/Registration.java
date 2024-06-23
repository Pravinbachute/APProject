package com.example.approject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registration extends AppCompatActivity {

    EditText edittextemail,edittextpassword;
    Button buttonreg;
    FirebaseAuth mAuth;




    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Toast.makeText(getApplicationContext(),"login sucussfull",Toast.LENGTH_LONG).show();
            Intent intent= new Intent(Registration.this, MainHome.class);
            startActivity(intent);

        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edittextemail=findViewById(R.id.editTextUsername);
        edittextpassword=findViewById(R.id.editTextPassword);
        mAuth=FirebaseAuth.getInstance();
        buttonreg=findViewById(R.id.buttonRegistration);


        buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email,password;
                email=String.valueOf(edittextemail.getText());
                password=String.valueOf(edittextpassword.getText());


                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Registration.this,"enter email",Toast.LENGTH_LONG).show();
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    Toast.makeText(Registration.this,"enter password",Toast.LENGTH_LONG).show();
                    return;

                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()) {

                                    Intent intent=new Intent(getApplicationContext(), MainHome.class);
                                    startActivity(intent);
                                    finish();
                                    Toast.makeText(Registration.this,"Account created",Toast.LENGTH_LONG).show();

                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(Registration.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });



            }
        });





    }
}
