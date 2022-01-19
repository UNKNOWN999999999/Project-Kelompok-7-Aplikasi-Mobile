package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Acc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acc);

        WebView webView2 = (WebView) findViewById(R.id.webview2);
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setDomStorageEnabled(true);

        webView2.getSettings().setSupportZoom(true);
        webView2.getSettings().setBuiltInZoomControls(true);
        webView2.getSettings().setDisplayZoomControls(false);

        webView2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://docs.google.com/forms/u/3/d/1FgzAT5SJ57afVp2smYaxB0P4SKK0tlfg1MCB5z7mEyk/");

    }

    public void asistensi(View view) {
        Intent intent = new Intent(this, Asistensi.class);
        startActivity(intent);
        finish();
    }
}