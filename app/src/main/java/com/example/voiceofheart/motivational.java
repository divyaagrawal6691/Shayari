package com.example.voiceofheart;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class motivational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational);
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(v -> finishAffinity());
    }
}