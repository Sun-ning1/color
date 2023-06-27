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



import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity{
    Button Option1;
    Button Option2;
    Button Option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage);

        Option1 =(Button) findViewById(R.id.option1);
        Option2 =(Button) findViewById(R.id.option2);
        Option3 =(Button) findViewById(R.id.option3);

    }



}
