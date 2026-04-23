package com.example.table;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotal = findViewById(R.id.tvTotal);

        int math = 85;
        int science = 90;
        int english = 78;

        int total = math + science + english;

        tvTotal.setText(String.valueOf(total));
    }
}