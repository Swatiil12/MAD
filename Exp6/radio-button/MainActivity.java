package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {

            RadioButton selectedRadio = findViewById(checkedId);

            if (selectedRadio != null) {
                String selectedText = selectedRadio.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Selected: " + selectedText,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}