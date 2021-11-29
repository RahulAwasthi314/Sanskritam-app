package com.awasthir.sanskritam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView basicsTextView = findViewById(R.id.basics_text_view);
        basicsTextView.setOnClickListener(v -> {
            Intent basicsIntent = new Intent(MainActivity.this, BasicsActivity.class);
            startActivity(basicsIntent);
        });

        TextView sholkasTextView = findViewById(R.id.shlok_text_view);
        sholkasTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                "You have clicked sholkas activity",
                Toast.LENGTH_SHORT).show());

        TextView vedasTextView = findViewById(R.id.vedas_text_view);
        vedasTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                "You have clicked Vedas activity",
                Toast.LENGTH_SHORT).show());
    }
}