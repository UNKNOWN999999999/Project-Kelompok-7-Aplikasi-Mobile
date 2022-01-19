package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Reguler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reguler);

        WebView reguler = (WebView) findViewById(R.id.reguler);
        reguler.getSettings().setLoadsImagesAutomatically(true);
        reguler.getSettings().setJavaScriptEnabled(true);
        reguler.getSettings().setDomStorageEnabled(true);

        reguler.getSettings().setSupportZoom(true);
        reguler.getSettings().setBuiltInZoomControls(true);
        reguler.getSettings().setDisplayZoomControls(false);

        reguler.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        reguler.setWebViewClient(new WebViewClient());
        reguler.loadUrl("https://lab-elektro.umm.ac.id/id/pages/praktikum-reguler.html");

    }

    public void praktikum(View view) {
        Intent intent = new Intent(this, Praktikum.class);
        startActivity(intent);
        finish();
    }
}