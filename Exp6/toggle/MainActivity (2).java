package com.example.toogle;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Switch switchWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchWifi = findViewById(R.id.switchWifi);

        switchWifi.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if (isChecked) {
                            Toast.makeText(MainActivity.this, "WiFi ON", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "WiFi OFF", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}