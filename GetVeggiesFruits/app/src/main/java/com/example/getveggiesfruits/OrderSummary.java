package com.example.getveggiesfruits;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class OrderSummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordersummary);
        TextView btn = (TextView) findViewById(R.id.textView14);
        btn.setText("Saitejaswini Narne");

    }

}