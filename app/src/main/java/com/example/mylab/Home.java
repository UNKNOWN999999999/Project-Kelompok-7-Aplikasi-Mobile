package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void praktikum(View view) {
        Intent intent = new Intent(this, Praktikum.class);
        startActivity(intent);
        finish();
    }

    public void informasi(View view) {
        Intent intent = new Intent(this, informasi.class);
        startActivity(intent);
        finish();
    }

    public void asistensi(View view) {
        Intent intent = new Intent(this, Asistensi.class);
        startActivity(intent);
        finish();
    }

    public void aslab(View view) {
        Intent intent = new Intent(this, Aslab.class);
        startActivity(intent);
        finish();
    }
}