package com.example.theapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity{

    Button tomain;
    EditText username;
    EditText pword;
    DatabaseControl control;
    EditText pwordchecker;
    Button submit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        control = new DatabaseControl(this);

        username = findViewById(R.id.username);
        pword = findViewById(R.id.pword);
        pwordchecker = findViewById(R.id.pwordchecker);
        submit = findViewById(R.id.submit);
        tomain = findViewById(R.id.tomain);

        tomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username = username.getText().toString();
                String Password = pword.getText().toString();
                String PasswordChecker = pwordchecker.getText().toString();
                control.open();
                boolean checkPass = Password.equals(PasswordChecker);
                boolean itWorked = control.insert(Username, Password);
                boolean checkUser = !Username.equals("");
                control.close();
                if (itWorked && checkPass && !Password.equals("") && checkUser){
                    Toast.makeText(getApplicationContext(), "Added " + Username + " " +Password, Toast.LENGTH_SHORT).show();
                } else {
                    if (!checkUser){
                        Toast.makeText(getApplicationContext(), "You need a username.", Toast.LENGTH_LONG).show();
                    } else if (Password.equals("")) {
                        Toast.makeText(getApplicationContext(), "You must have a password that is at least one character in length.", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords do not match.", Toast.LENGTH_LONG).show();
                    }
                    Toast.makeText(getApplicationContext(), "FAILED " + Username + " " +Password, Toast.LENGTH_LONG).show();
                }
                onResume();
            }
        });

    }
    public void onPause(){
        super.onPause();
    }
    @Override
    public void onResume()
    {
        super.onResume();
    }
}
