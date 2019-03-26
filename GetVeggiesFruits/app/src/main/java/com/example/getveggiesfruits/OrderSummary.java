package com.example.getveggiesfruits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class OrderSummary extends AppCompatActivity {
    public static  final int HAPPY=0;
    String customerFName;
    String customerLName;
    String customerAddress;
    String customerCardType;
    String customerCardNumber;
    String customerExpirationDate;
    String customerCVV;
    //String CustomerCardNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordersummary);
        Random rand = new Random();

        Intent intent = getIntent();
        String customerFName= intent.getStringExtra("CustomerFName");
        String customerLName= intent.getStringExtra("CustomerLName");
        String customerAddress= intent.getStringExtra("CustomerAddress");
        String customerCardType= intent.getStringExtra("CustomerCardType");
        String customerCardNumber= intent.getStringExtra("CustomerCardNumber");
        String customerExpirationDate= intent.getStringExtra("CustomerExpirationDate");
        String customerCVV= intent.getStringExtra("CustomerCVV");
        TextView tv = (TextView) findViewById(R.id.name);
        tv.setText(customerFName+customerLName);
        TextView tv1 = (TextView) findViewById(R.id.billingid);
        int n=100000+rand.nextInt()*900000;
        tv1.setText(n+"");
        String k="T"+(109879+rand.nextInt()*345678);
        TextView tv2 = (TextView) findViewById(R.id.tracking);
        tv2.setText(k);
        TextView tv3 = (TextView) findViewById(R.id.Address);
        tv3.setText(customerAddress);
    }

    public void returnToMain(View v)
    {
        Intent myIntent = new Intent(OrderSummary.this, MainActivity.class);
        startActivityForResult(myIntent,1);
    }


}