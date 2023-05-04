package com.example.theapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class application extends AppCompatActivity{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    Switch switch1;
    Switch switch2;
    Switch switch3;

    Button hack;

    ToggleButton toggle1;
    ToggleButton toggle2;
    ToggleButton toggle3;

    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;
    CheckBox check5;
    CheckBox check6;
    CheckBox check7;
    CheckBox check8;
    CheckBox check9;
    CheckBox check10;
    CheckBox check11;

    ImageView ex1;
    ImageView ex2;
    ImageView ex3;

    int explosions = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application);

        ex1 = findViewById(R.id.ex1);
        ex2 = findViewById(R.id.ex2);
        ex3 = findViewById(R.id.ex3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);

        toggle1 = findViewById(R.id.toggle1);
        toggle2 = findViewById(R.id.toggle2);
        toggle3 = findViewById(R.id.toggle3);

        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);
        check6 = findViewById(R.id.check6);
        check7 = findViewById(R.id.check7);
        check8 = findViewById(R.id.check8);
        check9 = findViewById(R.id.check9);
        check10 = findViewById(R.id.check10);
        check11 = findViewById(R.id.check11);

        hack = findViewById(R.id.hack);

        hack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosions++;
                if (explosions == 1){
                    ex1.setVisibility(view.VISIBLE);
                } else if (explosions == 2){
                    ex2.setVisibility(view.VISIBLE);
                } else if (explosions == 3){
                    ex3.setVisibility(view.VISIBLE);
                } else if (explosions == 4){
                    System.exit(0);
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setBackgroundColor(Color.GREEN);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setBackgroundColor(Color.GREEN);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3.setBackgroundColor(Color.GREEN);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setBackgroundColor(Color.GREEN);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5.setBackgroundColor(Color.GREEN);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6.setBackgroundColor(Color.GREEN);
            }
        });

        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggle2.isChecked() && toggle3.isChecked() && toggle1.isChecked()){
                    hack.setVisibility(View.VISIBLE);
                } else {
                    hack.setVisibility(View.GONE);
                }
            }
        });

        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggle2.isChecked() && toggle3.isChecked() && toggle1.isChecked()){
                    hack.setVisibility(View.VISIBLE);
                } else {
                    hack.setVisibility(View.GONE);
                }

            }
        });

        toggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggle2.isChecked() && toggle3.isChecked() && toggle1.isChecked()){
                    hack.setVisibility(View.VISIBLE);
                } else {
                    hack.setVisibility(View.GONE);
                }

            }
        });

    }



}
