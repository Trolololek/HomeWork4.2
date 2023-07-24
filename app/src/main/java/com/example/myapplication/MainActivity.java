package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();
                String value3 = editText3.getText().toString();
                String value4 = editText4.getText().toString();
                // Создаем новый Intent для перехода к Activity2
                Intent intent = new Intent(MainActivity.this, Second.class);

                // Передаем значения второй активности через Intent
                intent.putExtra("VALUE_1", value1);
                intent.putExtra("VALUE_2", value2);
                intent.putExtra("VALUE_3", value3);
                intent.putExtra("VALUE_4", value4);
                // Запускаем вторую активность
                startActivity(intent);
            }
        });
    }
}

