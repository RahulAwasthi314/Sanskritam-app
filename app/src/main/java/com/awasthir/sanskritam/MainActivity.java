package com.awasthir.sanskritam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.awasthir.sanskritam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // setContentView(R.layout.activity_main);

        //TextView basicsTextView = findViewById(R.id.basics_text_view);

        binding.basicsTextView.setOnClickListener(v -> {
            Intent basicsIntent = new Intent(MainActivity.this, BasicsActivity.class);
            startActivity(basicsIntent);
        });

        TextView sholkasTextView = findViewById(R.id.shlok_text_view);
        sholkasTextView.setOnClickListener(v -> {
            Intent basicsIntent = new Intent(MainActivity.this, ShlokActivity.class);
            startActivity(basicsIntent);
        });

        TextView vedasTextView = findViewById(R.id.vedas_text_view);
        vedasTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                "You have clicked Vedas activity",
                Toast.LENGTH_SHORT).show());
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int item_id= item.getItemId();

        if(item_id==R.id.privacy){
            Intent intent = new Intent(this,privacyActivity.class);
            startActivity(intent);

        }

        else if(item_id==R.id.about){
            Intent intent = new Intent(this,aboutActivity.class);
            startActivity(intent);
        }

        return true;
    }
}