package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class VeggiesandFruitsActivity extends AppCompatActivity {

    public static  final int HAPPY=0;
    protected static ArrayList<String> Name = new ArrayList<String>();
    protected static ArrayList<Integer> Count = new ArrayList<Integer>();
    protected static ArrayList<Event> Event = new ArrayList<Event>();


    private ListView listView;
    private VeggiesAdapter listAdapter;
    ArrayList<ProductsVeggiesAndFruits> products = new ArrayList<>();
    Button btnPlaceOrder;
    ArrayList<ProductsVeggiesAndFruits> productOrders = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_fruits_veggies);
        getProduct();
        listView = (ListView) findViewById(R.id.customListView);
        listAdapter = new VeggiesAdapter(this,products);
        listView.setAdapter(listAdapter);
        Button fruitdetails = (Button) findViewById(R.id.fruitdetails);
        fruitdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VeggiesandFruitsActivity.this, FruitsDetailsActivity.class);
                startActivityForResult(myIntent, 1);
            }
        });
        Button veggiedetails = (Button) findViewById(R.id.veggiedetails);
        veggiedetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(VeggiesandFruitsActivity.this, VeggieDetailsActivity.class);
                startActivityForResult(myIntent, 1);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initModel();
                listView.invalidateViews();
            }
        });

    }
    private void initModel(){
        Name.clear();
        Count.clear();
        Name.add("Apples");
        Count.add(0);
        Name.add("Oranges");
        Count.add(0);
        Name.add("Grapes");
        Count.add(0);
        Name.add("Tomatoes");
        Count.add(0);
        Name.add("Onions");
        Count.add(0);
    }
    Button veggiedetails = (Button) findViewById(R.id.veggiedetails);
        veggiedetails.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent myIntent = new Intent(VeggiesandFruitsActivity.this, VeggieDetailsActivity.class);
            startActivityForResult(myIntent, 1);
        }
    });
    Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            initModel();
            listView.invalidateViews();
        }
    });

}
    private void initModel(){
        Name.clear();
        Count.clear();
        Name.add("Apples");
        Count.add(0);
        Name.add("Oranges");
        Count.add(0);
        Name.add("Grapes");
        Count.add(0);
        Name.add("Tomatoes");
        Count.add(0);
        Name.add("Onions");
        Count.add(0);
    }
