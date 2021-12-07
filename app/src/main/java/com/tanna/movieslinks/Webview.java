package com.tanna.movieslinks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Webview extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wv = findViewById(R.id.wv);

        WebSettings webSettings= wv.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String privatemovie = getIntent().getStringExtra("private");
        String moviesverse = getIntent().getStringExtra("moviesverse");
        String movieshub = getIntent().getStringExtra("movieshub");
        String olamovies = getIntent().getStringExtra("olamovies");
        String moviesflixpro = getIntent().getStringExtra("moviesflixpro");
        String vegamovies = getIntent().getStringExtra("vegamovies");
        String hdhub4u = getIntent().getStringExtra("hdhub4u");
        String ninexmovies = getIntent().getStringExtra("ninexmovies");
        String movies123 = getIntent().getStringExtra("movies123");
        String world4ufree1 = getIntent().getStringExtra("world4ufree1");
        String katmoviehd = getIntent().getStringExtra("katmoviehd");

        wv.loadUrl(privatemovie);
        wv.loadUrl(moviesverse);
        wv.loadUrl(olamovies);
        wv.loadUrl(movieshub);
        wv.loadUrl(moviesflixpro);
        wv.loadUrl(vegamovies);
        wv.loadUrl(hdhub4u);
        wv.loadUrl(ninexmovies);
        wv.loadUrl(movies123);
        wv.loadUrl(world4ufree1);
        wv.loadUrl(katmoviehd);

        Log.e("WEbview","link " + wv);
    }
}