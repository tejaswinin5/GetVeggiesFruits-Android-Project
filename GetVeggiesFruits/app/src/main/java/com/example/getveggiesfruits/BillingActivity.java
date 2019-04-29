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
        myAdpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner2.setAdapter(myAdpater2);

        Button btn = (Button) findViewById (R.id.continueBUT);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView customerFName=(TextView)findViewById(R.id.editText2);
                TextView customerLName=(TextView)findViewById(R.id.editText3);
                TextView customerAddress=(TextView)findViewById(R.id.editText4);
                TextView customerNumber=(TextView)findViewById(R.id.cardNumber);
                TextView cardName=(TextView)findViewById(R.id.nameOfCard);
                TextView expiry=(TextView)findViewById(R.id.expiry);
                TextView cvv=(TextView)findViewById(R.id.securityText);
                long cardLong=0;
                if(!(customerNumber.getText().toString().equals(""))) {
                    cardLong = Long.parseLong(customerNumber.getText().toString());
                }
                if(customerFName.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "First Name is empty", Toast.LENGTH_SHORT).show();
                }
                else if(customerAddress.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter the address field to proceed further", Toast.LENGTH_SHORT).show();
                }
                else if (!isValid(cardLong)) {
                    Toast.makeText(getApplicationContext(), "Card is invalid", Toast.LENGTH_SHORT).show();
                }
                else if(cardName.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter the Name of the card", Toast.LENGTH_SHORT).show();
                }
                else if(expiry.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Expiry is invalid", Toast.LENGTH_SHORT).show();
                }
                else if(cvv.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "CVV is invalid", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent ini = new Intent(BillingActivity.this, OrderSummary.class);
                    ini.putExtra("CustomerFName", customerFName.getText().toString());
                    ini.putExtra("CustomerLName", customerLName.getText().toString());
                    ini.putExtra("CustomerAddress", customerAddress.getText().toString());
                    ParseObject billing = new ParseObject("BillingDetails");
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    System.out.println(dateFormat.format(date));
                    billing.put("CustomerFName",customerNumber.getText().toString());
                    billing.put("CustomerLName",customerLName.getText().toString());
                    billing.put("CustomerAddress",customerAddress.getText().toString());
                    billing.put("OrderDate",dateFormat.format(date));
                    billing.put("PurchaseAmount","8");
                    billing.put("PurchaseItems","Tomatoes Apples");
                    startActivityForResult(ini, 1);
                    billing.saveInBackground(new SaveCallback()
                    {
                        @Override public void done(ParseException e)
                        {
                            System.out.println("Saved Callback");
                        }
                    });
                }
            }
        });

        Button btn1 = (Button) findViewById(R.id.backBUT);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("new intent can be created");
                Intent intent = getIntent();
                finish();
            }
        });
    }
