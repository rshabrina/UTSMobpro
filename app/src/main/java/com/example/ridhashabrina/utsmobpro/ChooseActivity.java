package com.example.ridhashabrina.utsmobpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ChooseActivity extends AppCompatActivity {
    public static final String intent_cake="cake";
    public static final Integer intent_gambar=0;

    String[] NamaCake={
            "Cake Straw Delight",
            "Cake Straw Nutty",
            "Cake Straw Lumer",
            "Cake Straw Pinky",
    };

    Integer[] GambarCake={
            R.drawable.kue1,
            R.drawable.kue2,
            R.drawable.kue3,
            R.drawable.kue4
    };

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        list=(ListView) findViewById(R.id.ListCake);
        AdapterCake adapter=new AdapterCake(this, NamaCake, GambarCake);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(ChooseActivity.this, SendActivity.class);
                intent.putExtra(intent_cake,NamaCake[position]);
                intent.putExtra(String.valueOf(intent_gambar),GambarCake[position]);

                startActivity(intent);
            }

        });
    }
}
