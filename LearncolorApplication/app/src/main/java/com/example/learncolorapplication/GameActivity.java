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
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;


public class GameActivity extends AppCompatActivity{
    TextView textView;
    Button Option1;
    Button Option2;
    Button Option3;

    private String colorlist[] = {"Red","Orange","Yellow","Green","Cyanblue","Blue","Purple","Black","White","Grey"};


    private Integer colors[] = {
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

//    private int choose(){
//        for (Integer i :colors){
//            return i;
//
//        }
//        return 0;
//    }


//    public void main(String[] args) {
//        choose();
//        int choose;
//
//    }
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
        question_refresh();



        Option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question_refresh();

            }
        });

        Option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                question_refresh();
            }

        });

        Option3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                question_refresh();

            }
        });

    }



    private void question_refresh() {

        int num = random.nextInt(colorlist.length);
        int num1 = random.nextInt(colorlist.length);
        int num2 = random.nextInt(colorlist.length);



        Integer[] colorslist = {num,num1,num2};
        int num3 = random.nextInt(colorslist.length);


        textView.setBackgroundColor(
                ContextCompat.getColor(getApplicationContext(),
                        colors[colorslist[num3]])
        );

        Option1.setText(colorlist[num]);
        Option2.setText(colorlist[num1]);
        Option3.setText(colorlist[num2]);
    }




}
