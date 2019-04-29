package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DealsoftheDayActivity extends AppCompatActivity {

    public static  final int HAPPY=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealsofthe_day);
    }
            public void returntoMainPage(View v) {
                Intent intent = getIntent();
                setResult(HAPPY, intent);
                finish();
            }


        }

