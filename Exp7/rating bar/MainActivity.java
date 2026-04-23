package com.example.ratingbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private Button btnSubmitRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        ratingBar = findViewById(R.id.ratingBar);
        btnSubmitRating = findViewById(R.id.btnSubmitRating);

        // Button Click Event
        btnSubmitRating.setOnClickListener(v -> submitRating());
    }

    private void submitRating() {
        float rating = ratingBar.getRating();

        if (rating == 0) {
            Toast.makeText(this, "Please give a rating", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You rated: " + rating + " stars", Toast.LENGTH_SHORT).show();
        }
    }
}