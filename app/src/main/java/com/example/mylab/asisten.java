package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class asisten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asisten);

        WebView webView1 = (WebView) findViewById(R.id.webview1);
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setDomStorageEnabled(true);

        webView1.getSettings().setSupportZoom(true);
        webView1.getSettings().setBuiltInZoomControls(true);
        webView1.getSettings().setDisplayZoomControls(false);

        webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://docs.google.com/forms/d/1a-8dAcr6y3fbGxCo3CCyrKvlStk43S7Z7JORJF0hU2A/");

    }

    public void asistensi(View view) {
        Intent intent = new Intent(this, Asistensi.class);
        startActivity(intent);
        finish();
    }
}