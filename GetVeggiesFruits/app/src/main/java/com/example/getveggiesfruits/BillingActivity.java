package com.example.getveggiesfruits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        Spinner mspinner=(Spinner)findViewById(R.id.spinner1);
        mspinner.setSelection(0);
        ArrayAdapter<String> myAdpater=new ArrayAdapter<String>(BillingActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.card_names));
        myAdpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner.setAdapter(myAdpater);
        Spinner mspinner2=(Spinner)findViewById(R.id.spinner2);
        mspinner.setSelection(0);
        ArrayAdapter<String> myAdpater2=new ArrayAdapter<String>(BillingActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.names1));