package com.example.getveggiesfruits;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class VeggiesAdapter<String> extends ArrayAdapter<String> {
    public VeggiesAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        TextView eventCount = v.findViewById(android.R.id.text2);
        int count = VeggiesandFruitsActivity.Count.get(position);
        //String countString=count+' ';
        //String countString=Integer.toString(count);
        eventCount.setText(VeggiesandFruitsActivity.Count.get(position).toString());
        return v;
    }
}