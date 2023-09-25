package com.cs407.calculatorapp;
// Second activity to show the result of the calculation
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
        result = (TextView)findViewById(R.id.result);
        Intent intent = getIntent();
        String str = intent.getStringExtra("result");
        result.setText(str);
    }
}