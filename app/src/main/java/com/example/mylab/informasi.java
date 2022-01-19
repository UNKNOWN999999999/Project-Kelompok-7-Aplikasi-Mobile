package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class informasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
    }

    public void home(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }
}