package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button store = (Button) findViewById(R.id.button);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SelectStoreActivity.class);
                myIntent.putExtra("StroreName","Kansas");
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
    public void onActivityResult(int resultcode, int errorcode, Intent in){
        if(resultcode ==1){
            String store  = in.getStringExtra("StoreName");
            EditText selectedStoreName = (EditText) findViewById(R.id.StoreName);
            selectedStoreName.setText(store);
        }
    }
}
