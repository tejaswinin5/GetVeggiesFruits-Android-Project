package com.example.getveggiesfruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectStoreActivity extends AppCompatActivity {

    protected static ArrayList<String> StoreName = new ArrayList<String>();
    public static  final int HAPPY=0;

    private void initModel() {
        StoreName.clear();
        StoreName.add("Kansas");
        StoreName.add("Missouri");
        StoreName.add("Nebraska");
        StoreName.add("Omaha");
        StoreName.add("Florida");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_store);
        initModel();
        StoreAdapter<String> storeAdapter = new StoreAdapter<>(this,
                android.R.layout.simple_list_item_2,
                android.R.id.text1,
                StoreName);
        final ListView StoreListview = (ListView) findViewById(R.id.StoreListView);
        StoreListview.setAdapter(storeAdapter);
        StoreListview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String store = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(SelectStoreActivity.this, store, Toast.LENGTH_LONG).show();
                        // int count=Count.get(position);
                        //  Count.add(position,count+1);
                        StoreListview.invalidateViews();
                    }
                }
        );


    }
    public void returnAction(View v)
    {
        Intent intent = getIntent();
        //intent.putExtra("storeName",kansas);
        setResult(HAPPY,intent);
        finish();
    }

}