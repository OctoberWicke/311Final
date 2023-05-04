package com.example.theapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity{

    Button tomain2;
    EditText username2;
    EditText pword2;
    DatabaseControl control;
    Button submit2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        control = new DatabaseControl(this);

        tomain2 = findViewById(R.id.tomain2);
        username2 = findViewById(R.id.username2);
        pword2 = findViewById(R.id.pword2);
        submit2 = findViewById(R.id.submit2);
        tomain2 = findViewById(R.id.tomain2);

        tomain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Username = username2.getText().toString();
                String Password = pword2.getText().toString();
                boolean checkPass = Password.equals("");
                boolean checkUser = Password.equals("");
                if (checkPass && checkUser) {
                    Toast.makeText(getApplicationContext(), "Not work.", Toast.LENGTH_SHORT).show();
                } else {
                    control.open();
                    String sauce = control.attemptSignIn(Username);
                    control.close();
                    if (sauce.equals(Password)) {
                        Toast.makeText(getApplicationContext(), "This Login Works.", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(signin.this, application.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "Oh no.", Toast.LENGTH_SHORT).show();
                    }
                }
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
