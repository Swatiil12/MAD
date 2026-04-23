package com.example.absolute;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnBalance, btnWithdraw, btnDeposit, btnExit;
    TextView tvScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Linking XML components
        btnBalance = findViewById(R.id.btnBalance);
        btnWithdraw = findViewById(R.id.btnWithdraw);
        btnDeposit = findViewById(R.id.btnDeposit);
        btnExit = findViewById(R.id.btnExit);
        tvScreen = findViewById(R.id.tvScreen);

        // Button actions
        btnBalance.setOnClickListener(v ->
                tvScreen.setText("💰 Balance: ₹10,000"));

        btnWithdraw.setOnClickListener(v ->
                tvScreen.setText("💸 Withdraw Selected"));

        btnDeposit.setOnClickListener(v ->
                tvScreen.setText("💵 Deposit Selected"));

        btnExit.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Thank You!", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}