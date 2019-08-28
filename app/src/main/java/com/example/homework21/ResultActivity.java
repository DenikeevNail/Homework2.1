package com.example.homework21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.result);
        Intent intent2 = getIntent();
        float sum = intent2.getFloatExtra("result", 0);
        result.setText("RESULT is = " + sum + "");

    }
}
