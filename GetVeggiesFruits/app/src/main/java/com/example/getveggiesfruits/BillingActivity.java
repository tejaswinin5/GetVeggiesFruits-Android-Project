package com.example.getveggiesfruits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BillingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);

        Button btn = (Button) findViewById (R.id.continueBUT);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView customerFName=(TextView)findViewById(R.id.editText2);
                TextView customerLName=(TextView)findViewById(R.id.editText3);
                TextView customerAddress=(TextView)findViewById(R.id.editText4);
                TextView customerCardType=(TextView)findViewById(R.id.cardNumber);

                Intent ini=new Intent(BillingActivity.this, OrderSummary.class);
                ini.putExtra("CustomerFName",customerFName.getText().toString());
                ini.putExtra("CustomerLName",customerLName.getText().toString());
                ini.putExtra("CustomerAddress", customerAddress.getText().toString());
              //  ini.putExtra("CustomerCardType",customerCardType.getText().toString());
                startActivityForResult(ini, 1);

            }
        });
        Button btn1 = (Button) findViewById(R.id.backBUT);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("new intent can be created");
                Intent intent = getIntent();
                //      setResult(HAPPY,intent);
                finish();
            }
        });
    }

    public void returnToVeggies(View v) {
        Intent intent = getIntent();
        //      setResult(HAPPY,intent);
        finish();

    }
}