package com.liveperson.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = this.findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        /*
        webView.settings.allowContentAccess = true
        webView.settings.allowFileAccess = true
        webView.settings.databaseEnabled = true
        webView.settings.loadsImagesAutomatically = true
        webView.settings.useWideViewPort = true
        webView.settings.domStorageEnabled = true
        webView.settings.setSupportZoom(true)
         */
        webView.loadUrl("https://ts-apac-rmaeda.s3.amazonaws.com/html/dflow_web_embedded.html")
    }
}
