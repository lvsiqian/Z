package com.example.yuekao;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        web = (WebView) findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        //得到第一个页面传过来的数据
        Intent intent = getIntent();
        String link = intent.getStringExtra("link");
        web.loadUrl(link);
    }
}
