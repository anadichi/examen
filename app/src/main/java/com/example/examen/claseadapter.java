package com.example.examen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class claseadapter extends BaseAdapter {

    private ArrayList<listviewteam> items;

    public claseadapter(ArrayList<listviewteam> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public listviewteam getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater
                    .from(viewGroup.getContext())
                    .inflate(R.layout.listview_item, viewGroup, false);
        }
        decorateWith(view, items.get(i));
        return view;
    }

    private void decorateWith(View view, listviewteam listviewteam) {
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);
        imageView.setImageResource(listviewteam.getImageResource());
        textView.setText(listviewteam.getTitle());
        imageView.setColorFilter(ContextCompat.getColor(view.getContext(), listviewteam.getColorId()));
    }
}