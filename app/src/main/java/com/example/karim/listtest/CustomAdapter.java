package com.example.karim.listtest;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] names;
    private final Integer[] images;

    public CustomAdapter( Activity context, String[] names, Integer[] images) {

        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =  context.getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_row,null,true);

        TextView textView = (TextView) view.findViewById(R.id.grid_text);
        textView.setText(names[position]);

        ImageView imageView = (ImageView) view.findViewById(R.id.grid_image);
        imageView.setImageResource(images[position]);

        return view;
    }
}
