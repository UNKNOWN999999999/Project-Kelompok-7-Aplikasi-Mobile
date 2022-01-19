package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class Praktikum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);

    }

    public void home(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }

    public void reguler(View view) {
        Intent intent = new Intent(this, Reguler.class);
        startActivity(intent);
        finish();
    }

    public void daya(View view) {
        Intent intent = new Intent(this, Daya.class);
        startActivity(intent);
        finish();
    }

    public void elektronika(View view) {
        Intent intent = new Intent(this, Elektronika.class);
        startActivity(intent);
        finish();
    }

    public void jaringan(View view) {
        Intent intent = new Intent(this, Jaringan.class);
        startActivity(intent);
        finish();
    }
}