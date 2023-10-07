package com.example.voiceofheart;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(v -> finishAffinity());
        button = findViewById(R.id.btn3);
        button.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });
        button = findViewById(R.id.btn4);
        button.setOnClickListener(v -> {
            Intent intent= new Intent( MainActivity2.this, motivational.class);
            startActivity(intent);
        });
        button = findViewById(R.id.btn5);
        button.setOnClickListener(v -> {
            Intent intent= new Intent( MainActivity2.this, friendship.class);
            startActivity(intent);
        });
    }
}