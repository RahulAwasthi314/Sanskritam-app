package com.awasthir.sanskritam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class ShlokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shlok);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ImageView image_view = findViewById(R.id.pdf_image_view);
        image_view.setOnClickListener(v -> {
            Intent pdfIntent = new Intent(ShlokActivity.this, PdfActivity.class);
            startActivity(pdfIntent);
        });

        ImageView image_view2 = findViewById(R.id.pdf_image_view2);
        image_view2.setOnClickListener(v -> {
            Toast.makeText(ShlokActivity.this, "clicked 2nd activity", Toast.LENGTH_SHORT).show();
        });
    }
}