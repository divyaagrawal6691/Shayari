package com.example.voiceofheart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class friendship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship);
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(v -> finishAffinity());
    }
}