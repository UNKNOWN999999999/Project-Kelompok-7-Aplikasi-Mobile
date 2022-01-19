package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Daya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daya);

        WebView daya = (WebView) findViewById(R.id.daya);
        daya.getSettings().setLoadsImagesAutomatically(true);
        daya.getSettings().setJavaScriptEnabled(true);
        daya.getSettings().setDomStorageEnabled(true);

        daya.getSettings().setSupportZoom(true);
        daya.getSettings().setBuiltInZoomControls(true);
        daya.getSettings().setDisplayZoomControls(false);

        daya.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        daya.setWebViewClient(new WebViewClient());
        daya.loadUrl("https://lab-elektro.umm.ac.id/id/pages/bidang-sistem-tenaga-listrik.html");

    }

    public void praktikum(View view) {
        Intent intent = new Intent(this, Praktikum.class);
        startActivity(intent);
        finish();
    }
}