package com.example.implicit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    // Open Snapchat
    public void openSnapchat(android.view.View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.snapchat.android");
        if (intent != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Snapchat not installed", Toast.LENGTH_SHORT).show();
        }
    }

    // Open Instagram
    public void openInstagram(android.view.View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        if (intent != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "Instagram not installed", Toast.LENGTH_SHORT).show();
        }
    }

    // Open GPS / Maps
    public void openGPS(android.view.View view) {
        Uri location = Uri.parse("geo:0,0?q=near me");
        Intent intent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(intent);
    }

    // Open Camera
    public void openCamera(android.view.View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
}