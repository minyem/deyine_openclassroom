package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;

public class ViewNeighbourActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewneighbouractivity);

        Intent bundle= getIntent();
        String userName=bundle.getStringExtra("username");
        String photo=bundle.getStringExtra("photo");
        TextView name = findViewById(R.id.nameLyt);
        TextView name1 = findViewById(R.id.nameLyt1);
        ImageView   img = findViewById(R.id.kb9);
        Glide.with(this).load(photo).into(img);
        name.setText(userName);
        name1.setText(userName);

    }

}