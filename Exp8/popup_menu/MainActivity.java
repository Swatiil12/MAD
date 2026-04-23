package com.example.popup;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnMenu);

        btn.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btn);
            popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.edit) {
                    Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.delete) {
                    Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.share) {
                    Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show();
                }
                return true;
            });

            popupMenu.show();
        });
    }
}