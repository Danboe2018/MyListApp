package com.webappclouds.mylistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] Fruits) {
        super(context, R.layout.custom_row, Fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row,parent,false);

        String singleFruitItem = getItem(position);

        TextView myText = customView.findViewById(R.id.myText);
        ImageView myImage = customView.findViewById(R.id.myImage);

        myText.setText(singleFruitItem);
        myImage.setImageResource(R.drawable.apple);

        return customView;
    }
}
