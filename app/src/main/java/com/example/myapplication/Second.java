package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView4);
        TextView textView4 = findViewById(R.id.textView7);

        Intent intent = getIntent();


        String value1 = intent.getStringExtra("VALUE_1");
        String value2 = intent.getStringExtra("VALUE_2");
        String value3 = intent.getStringExtra("VALUE_3");
        String value4 = intent.getStringExtra("VALUE_4");

        textView1.setText(value1);
        textView2.setText(value2);
        textView3.setText(value3);
        textView4.setText(value4);
    }
}

