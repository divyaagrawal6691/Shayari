package com.example.voiceofheart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(v -> finishAffinity());
        button = findViewById(R.id.btn2);
        button.setOnClickListener(v -> {
            Intent intent= new Intent( MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}
