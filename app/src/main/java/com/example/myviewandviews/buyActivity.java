package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class buyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#38C933"));
        if (getSupportActionBar() != null){
            getSupportActionBar().setBackgroundDrawable(colorDrawable);
        }
    }
}