package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#38C933"));
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("IPhone 14 Pro Max");
            getSupportActionBar().setBackgroundDrawable(colorDrawable);
        }

        Button btnCallCS = findViewById(R.id.btn_dial_number);
        btnCallCS.setOnClickListener(this);

        Button btnBuy = findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_buy:
                Intent moveIntent = new Intent(MainActivity.this, buyActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_dial_number:
                String phoneNumber = "081234567890";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}