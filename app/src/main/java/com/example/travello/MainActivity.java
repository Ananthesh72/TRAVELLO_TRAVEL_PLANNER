package com.example.travello;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    AppCompatImageButton b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.imageButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","Bengaluru");
                startActivity(intent);
            }
        });
        b2=findViewById(R.id.imageButton2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","Mangaluru");
                startActivity(intent);
            }
        });
        b3=findViewById(R.id.imageButton3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","Chennai");
                startActivity(intent);
            }
        });
        b4=findViewById(R.id.imageButton4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","Mumbai");
                startActivity(intent);
            }
        });
        b5=findViewById(R.id.imageButton5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","New Delhi");
                startActivity(intent);
            }
        });
        b6=findViewById(R.id.imageButton6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityDetails.class);
                intent.putExtra("keycity","Kolkata");
                startActivity(intent);
            }
        });
    }
}
