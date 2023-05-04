package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin;
    Button signup;
    Button start;
    Button why;
    SeekBar whoa;
    TextView load;
    int donttestmypatience = 1;
    boolean check = false;
    ConstraintLayout layout;
    double background;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = findViewById(R.id.signin);
        signup = findViewById(R.id.signup);
        start = findViewById(R.id.start);
        why = findViewById(R.id.why);
        whoa = findViewById(R.id.whoa);
        load = findViewById(R.id.load);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!check) {
                    whoa.setVisibility(View.VISIBLE);
                    load.setVisibility(View.VISIBLE);
                    check = true;
                } else {
                    whoa.setVisibility(View.GONE);
                    load.setVisibility(View.GONE);
                    check = false;
                }

            }
        });

        whoa.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                load.setText("Loading Progress: " + i + "%");
                if (i == 100){
                    signin.setVisibility(View.VISIBLE);
                    signup.setVisibility(View.VISIBLE);
                } else {
                    signin.setVisibility(View.GONE);
                    signup.setVisibility(View.GONE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, signin.class);
                startActivity(i);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, signup.class);
                startActivity(i);
            }
        });

        why.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (donttestmypatience == 1) {
                    Toast.makeText(getApplicationContext(), "YEA, WELL. THIS DOESN'T DO ANYTHING. SO DON'T TRY IT AGAIN.", Toast.LENGTH_SHORT).show();
                    donttestmypatience++;
                } else if (donttestmypatience == 2) {
                    Toast.makeText(getApplicationContext(), "OKAY BUDDY YOU'RE GETTING ON MY NERVES...", Toast.LENGTH_SHORT).show();
                    donttestmypatience++;
                } else if (donttestmypatience == 3) {
                    Toast.makeText(getApplicationContext(), "ONE MORE TIME AND SEE WHAT I DO!", Toast.LENGTH_SHORT).show();
                    donttestmypatience++;
                } else if (donttestmypatience == 4) {
                    System.exit(0);
                }
            }
        });


    }




    @Override
    public void onResume() {
        super.onResume();
    }



}