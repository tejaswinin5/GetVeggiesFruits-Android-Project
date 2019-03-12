package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class VeggiesandFruitsActivity extends AppCompatActivity {

    public static  final int HAPPY=0;
    protected static ArrayList<String> Name = new ArrayList<String>();
    protected static ArrayList<Integer> Count = new ArrayList<Integer>();
    protected static ArrayList<Event> Event = new ArrayList<Event>();
    private void initModel(){
        Name.clear();
        Count.clear();
        Name.add("Apples");
        Count.add(1);
        Name.add("Oranges");
        Count.add(1);
        Name.add("Grapes");
        Count.add(1);
        Name.add("Tomatoes");
        Count.add(1);
        Name.add("Onions");
        Count.add(1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_fruits_veggies);
        initModel();
        VeggiesAdapter<String> vegAdapter=new VeggiesAdapter(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                Name);
        final ListView vegListview=(ListView) findViewById(R.id.VeggiesFruitsList);
        vegListview.setAdapter(vegAdapter);
        vegListview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String event=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(VeggiesandFruitsActivity.this,event,Toast.LENGTH_LONG).show();
                        int count=Count.get(position);
                        Count.set(position,count+1);
                        vegListview.invalidateViews();
                    }
                }
        );
    }
    public void returnToMAin(View v)
    {
        Intent intent = getIntent();
        setResult(HAPPY,intent);
        finish();
    }
    public void proceedToBilling(View v)
    {
        Intent myIntent = new Intent(VeggiesandFruitsActivity.this, BillingActivity.class);
        startActivityForResult(myIntent,1);
        //  Intent intent = getIntent();
//        setResult(HAPPY,intent);
        //      finish();
    }
}
