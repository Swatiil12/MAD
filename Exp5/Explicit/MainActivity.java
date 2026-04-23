package com.example.explicit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                // Simple validation
                if(user.equals("swati") && pass.equals("1234")) {

                    // Explicit Intent
                    Intent intent = new Intent(MainActivity.this, com.example.explicit.ResumeActivity.class);
                    intent.putExtra("username", user);
                    startActivity(intent);

                } else {
                    username.setError("Invalid Username or Password");
                }
            }
        });
    }
}