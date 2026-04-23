package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnResult;
    TextView tvResult;

    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnResult = findViewById(R.id.btnResult);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(v -> operation = "add");
        btnSub.setOnClickListener(v -> operation = "sub");
        btnMul.setOnClickListener(v -> operation = "mul");
        btnDiv.setOnClickListener(v -> operation = "div");

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                if(n1.isEmpty() || n2.isEmpty()){
                    tvResult.setText("Please enter both numbers");
                    return;
                }

                double number1 = Double.parseDouble(n1);
                double number2 = Double.parseDouble(n2);
                double result = 0;

                switch (operation){
                    case "add":
                        result = number1 + number2;
                        break;

                    case "sub":
                        result = number1 - number2;
                        break;

                    case "mul":
                        result = number1 * number2;
                        break;

                    case "div":
                        if(number2 == 0){
                            tvResult.setText("Cannot divide by zero");
                            return;
                        }
                        result = number1 / number2;
                        break;

                    default:
                        tvResult.setText("Select operation first");
                        return;
                }

                tvResult.setText("Answer: " + result);
            }
        });
    }
}