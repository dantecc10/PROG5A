package com.prog5a;
/*
    Por Dante Castelán Carpinteyro, para PROG5A;
    Voluntario en desarrollo web;
    Creada el 23 de octubre del 2022;
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = findViewById(R.id.prog5a);
        myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.setDomStorageEnabled(true);
        myWebView.loadUrl("https://prog5a.com/");
        myWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}