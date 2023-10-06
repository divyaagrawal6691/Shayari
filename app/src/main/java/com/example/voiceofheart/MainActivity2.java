package com.example.voiceofheart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(v -> finishAffinity());
        button = findViewById(R.id.btn3);
        button.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });
        button = findViewById(R.id.btn4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        });button = findViewById(R.id.btn5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
            }
        });



    }
}