package com.example.button_textfill;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        etName = findViewById(R.id.etName);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Button Click Event
        btnSubmit.setOnClickListener(v -> handleSubmit());
    }

    private void handleSubmit() {
        String name = etName.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Welcome, " + name, Toast.LENGTH_SHORT).show();
        }
    }
}