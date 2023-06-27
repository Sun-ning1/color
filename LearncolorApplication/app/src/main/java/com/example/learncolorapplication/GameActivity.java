package com.example.learncolorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.GameManager;
import android.os.Bundle;
import android.widget.Button;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameActivity extends AppCompatActivity{
    TextView textView;
    Button Option1;
    Button Option2;
    Button Option3;


    Integer[] colors = {
            R.color.Red,
            R.color.Orange,
            R.color.Yellow,
            R.color.Green,
            R.color.Cyanblue,
            R.color.Blue,
            R.color.Purple,
            R.color.Black,
            R.color.White,
            R.color.Grey,

    };
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage);

        random = new Random();

        textView = (TextView) findViewById(R.id.textView);

        Option1 =(Button) findViewById(R.id.option1);
        Option2 =(Button) findViewById(R.id.option2);
        Option3 =(Button) findViewById(R.id.option3);


        Option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Option1.setText("X");
                textView.setBackgroundColor(
                        ContextCompat.getColor(getApplicationContext(),
                                colors[random.nextInt(colors.length)])
                );

            }
        });

    }



}
