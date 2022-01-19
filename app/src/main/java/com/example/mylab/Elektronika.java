package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Elektronika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elektronika);

        WebView elektronika = (WebView) findViewById(R.id.elektronika);
        elektronika.getSettings().setLoadsImagesAutomatically(true);
        elektronika.getSettings().setJavaScriptEnabled(true);
        elektronika.getSettings().setDomStorageEnabled(true);

        elektronika.getSettings().setSupportZoom(true);
        elektronika.getSettings().setBuiltInZoomControls(true);
        elektronika.getSettings().setDisplayZoomControls(false);

        elektronika.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        elektronika.setWebViewClient(new WebViewClient());
        elektronika.loadUrl("https://lab-elektro.umm.ac.id/id/pages/bidang-elektronika.html");

    }

    public void praktikum(View view) {
        Intent intent = new Intent(this, Praktikum.class);
        startActivity(intent);
        finish();
    }
}