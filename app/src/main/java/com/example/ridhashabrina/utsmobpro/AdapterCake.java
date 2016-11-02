package com.example.ridhashabrina.utsmobpro;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ridha Shabrina on 02/11/2016.
 */

public class AdapterCake extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] item;
    private final Integer[] gambar;

    public AdapterCake(Activity context, String[] item, Integer[] gambar){
        super(context, R.layout.list_cake, item);

        this.context=context;
        this.item=item;
        this.gambar=gambar;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_cake, null, true);

        TextView title = (TextView) rowView.findViewById(R.id.NamaCake);
        ImageView image = (ImageView) rowView.findViewById(R.id.GambarCake);

        title.setText(item[position]);
        image.setImageResource(gambar[position]);
        return rowView;
    }
}
