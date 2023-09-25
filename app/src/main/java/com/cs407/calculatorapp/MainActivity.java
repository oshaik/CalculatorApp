package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void additionClick(View view) {
        EditText first = (EditText) findViewById(R.id.firstNumber);
        EditText second = (EditText) findViewById(R.id.secondNumber);
        int a = Integer.parseInt(first.getText().toString());
        int b = Integer.parseInt(second.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", "" + (a + b));
        startActivity(intent);
    }
    public void subtractionClick(View view) {
        EditText first = (EditText) findViewById(R.id.firstNumber);
        EditText second = (EditText) findViewById(R.id.secondNumber);
        int a = Integer.parseInt(first.getText().toString());
        int b = Integer.parseInt(second.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", "" + (a - b));
        startActivity(intent);
    }
    public void multiplicationClick(View view) {
        EditText first = (EditText) findViewById(R.id.firstNumber);
        EditText second = (EditText) findViewById(R.id.secondNumber);
        int a = Integer.parseInt(first.getText().toString());
        int b = Integer.parseInt(second.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", "" + (a * b));
        startActivity(intent);
    }
    public void divisionClick(View view) {
        EditText first = (EditText) findViewById(R.id.firstNumber);
        EditText second = (EditText) findViewById(R.id.secondNumber);
        int a = Integer.parseInt(first.getText().toString());
        int b = Integer.parseInt(second.getText().toString());
        Intent intent = new Intent(this, ResultActivity.class);
        if (b == 0)
            intent.putExtra("result", "Divide by Zero Error");
        else
            intent.putExtra("result", "" + ((double) a / b));
        startActivity(intent);
    }
}