package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // Your contact names
    String[] contacts = {
            "John Smith",
            "Emma Johnson",
            "Michael Brown",
            "Sophia Williams",
            "Daniel Jones",
            "Olivia Garcia",
            "James Miller",
            "Ava Davis"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewContacts);

        // Use simple_list_item_1 to show only one text per row
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                contacts
        );

        listView.setAdapter(adapter);
    }
}