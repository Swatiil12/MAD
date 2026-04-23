package com.example.progressbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button btnStart;
    private int progressStatus = 0;
    private Handler handler = new Handler();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        progressBar = findViewById(R.id.progressBar);
        btnStart = findViewById(R.id.btnStart);

        // Button Click Event
        btnStart.setOnClickListener(v -> startDownload());
    }

    private void startDownload() {

        progressStatus = 0;

        new Thread(() -> {
            while (progressStatus < 100) {
                progressStatus += 10;

                handler.post(() -> progressBar.setProgress(progressStatus));

                try {
                    Thread.sleep(500); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            handler.post(() ->
                    Toast.makeText(MainActivity.this,
                            "Download Complete",
                            Toast.LENGTH_SHORT).show());
        }).start();
    }
}