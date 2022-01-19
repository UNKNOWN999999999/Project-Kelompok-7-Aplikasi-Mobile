package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Revisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisi);

        WebView webView3 = (WebView) findViewById(R.id.webview3);
        webView3.getSettings().setLoadsImagesAutomatically(true);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.getSettings().setDomStorageEnabled(true);

        webView3.getSettings().setSupportZoom(true);
        webView3.getSettings().setBuiltInZoomControls(true);
        webView3.getSettings().setDisplayZoomControls(false);

        webView3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView3.setWebViewClient(new WebViewClient());
        webView3.loadUrl("https://drive.google.com/drive/folders/1ILnWy8_IXPnNfpZrzfdeVPljB2IWka2b?usp=sharing");

    }

    public void asistensi(View view) {
        Intent intent = new Intent(this, Asistensi.class);
        startActivity(intent);
        finish();
    }
}