package com.example.application;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtName, edtBranch, edtRoll, edtPhone, edtAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtBranch = findViewById(R.id.edtBranch);
        edtRoll = findViewById(R.id.edtRoll);
        edtPhone = findViewById(R.id.edtPhone);
        edtAddress = findViewById(R.id.edtAddress);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            Intent intent = new Intent();

            intent.setComponent(new ComponentName(
                    "com.example.displayapp",
                    "com.example.displayapp.MainActivity"
            ));

            intent.putExtra("name", edtName.getText().toString());
            intent.putExtra("phone", edtPhone.getText().toString());
            intent.putExtra("branch", edtBranch.getText().toString());
            intent.putExtra("roll", edtRoll.getText().toString());
            intent.putExtra("address", edtAddress.getText().toString());

            startActivity(intent);
        });
    }
}