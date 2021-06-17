package com.liveperson.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = this.findViewById(R.id.webview)
        webView.loadUrl("https://ts-apac-rmaeda.s3.amazonaws.com/html/dflow_web_embedded.html")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(false)
        // webView.settings.databaseEnabled = true
        // webView.settings.domStorageEnabled = true
       //  webView.settings.offscreenPreRaster = true
    }
}
