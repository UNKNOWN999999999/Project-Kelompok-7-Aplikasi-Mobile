package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Asistensi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistensi);
    }


    public void home(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }

    public void asisten(View view) {
        Intent intent = new Intent(this, asisten.class);
        startActivity(intent);
        finish();
    }

    public void acc(View view) {
        Intent intent = new Intent(this, Acc.class);
        startActivity(intent);
        finish();
    }

    public void revisi(View view) {
        Intent intent = new Intent(this, Revisi.class);
        startActivity(intent);
        finish();
    }
}