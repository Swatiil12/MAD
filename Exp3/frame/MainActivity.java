package com.example.frame;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout overlayLayout;
    Button btnBalance, btnWithdraw, btnDeposit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        overlayLayout = findViewById(R.id.overlayLayout);
        btnBalance = findViewById(R.id.btnBalance);
        btnWithdraw = findViewById(R.id.btnWithdraw);
        btnDeposit = findViewById(R.id.btnDeposit);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProcessing();
            }
        };

        btnBalance.setOnClickListener(listener);
        btnWithdraw.setOnClickListener(listener);
        btnDeposit.setOnClickListener(listener);
    }

    private void showProcessing() {
        overlayLayout.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                overlayLayout.setVisibility(View.GONE);
            }
        }, 2000);
    }
}