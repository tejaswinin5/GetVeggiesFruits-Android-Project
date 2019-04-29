package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SelectStoreActivity.class);
                startActivityForResult(myIntent, 1);
            }
        });
        Button deals = (Button) findViewById(R.id.DealsoftheDay);
        deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, DealsoftheDayActivity.class);
                startActivityForResult(myIntent, 1);
            }
        });
        Button cntButton = (Button) findViewById(R.id.CONTINUE);
        cntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, VeggiesandFruitsActivity.class);
                startActivityForResult(myIntent, 1);
            }
        });
    }
}
