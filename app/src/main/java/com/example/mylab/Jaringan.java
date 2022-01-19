package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Jaringan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaringan);

        WebView jaringan = (WebView) findViewById(R.id.jaringan);
        jaringan.getSettings().setLoadsImagesAutomatically(true);
        jaringan.getSettings().setJavaScriptEnabled(true);
        jaringan.getSettings().setDomStorageEnabled(true);

        jaringan.getSettings().setSupportZoom(true);
        jaringan.getSettings().setBuiltInZoomControls(true);
        jaringan.getSettings().setDisplayZoomControls(false);

        jaringan.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        jaringan.setWebViewClient(new WebViewClient());
        jaringan.loadUrl("https://lab-elektro.umm.ac.id/id/pages/bidang-komunikasi-informasi.html");

    }

    public void praktikum(View view) {
        Intent intent = new Intent(this, Praktikum.class);
        startActivity(intent);
        finish();
    }
}