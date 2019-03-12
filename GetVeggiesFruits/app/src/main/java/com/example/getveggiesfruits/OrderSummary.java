package com.example.getveggiesfruits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordersummary);
        TextView btn = (TextView) findViewById(R.id.name);
        btn.setText("Sai Tejaswini Narne");

        TextView btn1 = (TextView) findViewById(R.id.billingid);
        btn1.setText("10354");

        TextView btn2 = (TextView) findViewById(R.id.tracking);
        btn2.setText("12324354655");

        TextView btn3 = (TextView) findViewById(R.id.Address);
        btn3.setText("1115 N College Dr #100 " +
                "Maryville " +
                "MO " +
                "64468  ");






    }

    public void returnToMain(View v)
    {
//        Intent intent = getIntent();
//        setResult(HAPPY,intent);
//        finish();
        Intent myIntent = new Intent(OrderSummary.this, MainActivity.class);
        startActivityForResult(myIntent,1);
    }

}