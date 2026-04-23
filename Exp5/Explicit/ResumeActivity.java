package com.example.explicit;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResumeActivity extends AppCompatActivity {

    TextView name, email, skills, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        name = findViewById(R.id.tvName);
        email = findViewById(R.id.tvEmail);
        skills = findViewById(R.id.tvSkills);
        about = findViewById(R.id.tvAbout);

        String user = getIntent().getStringExtra("username");

        name.setText(user);
        email.setText("Email: swati@example.com");
        skills.setText("Java, Android, SQL, C++");
        about.setText("Passionate student interested in Android development.");
    }
}