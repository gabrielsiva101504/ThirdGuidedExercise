package com.example.thirdguidedexercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNum1GE3, etNum2GE3;
    Button btnSumGE3, btnAveGE3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1GE3 = findViewById(R.id.etNum1GE3);
        etNum2GE3 = findViewById(R.id.etNum2GE3);
        btnSumGE3 = findViewById(R.id.btnSumGE3);
        btnAveGE3 = findViewById(R.id.btnAveGE3);

        View.OnClickListener operationListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = etNum1GE3.getText().toString().trim();
                String num2Str = etNum2GE3.getText().toString().trim();

                if (num1Str.isEmpty()) {
                    etNum1GE3.setError("Please Enter a Number");
                    return;
                }
                if (num2Str.isEmpty()) {
                    etNum2GE3.setError("Please Enter a Number");
                    return;
                }

                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);

                if (v.getId() == R.id.btnSumGE3) {
                    double sum = num1 + num2;
                    Toast.makeText(MainActivity.this, "SUM: " + sum, Toast.LENGTH_SHORT).show();
                } else if (v.getId() == R.id.btnAveGE3) {
                    double ave = (num1 + num2) / 2;
                    Toast.makeText(MainActivity.this, "AVE: " + ave, Toast.LENGTH_SHORT).show();
                }
            }
        };

        btnSumGE3.setOnClickListener(operationListener);
        btnAveGE3.setOnClickListener(operationListener);
    }
}
