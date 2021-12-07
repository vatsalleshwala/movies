package com.tanna.movieslinks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    Button btn_privatemoviez,btn_moviesverse,btn_olamovies,btn_movieshub,btn_moviesflixpro,btn_vegamovies,btn_hdhub4u,btn_9xmovies;
    Button btn_movies123,btn_world4ufree1,btn_katmoviehd;
    String privatemovie = "https://privatemoviez.cc/";
    String moviesverse = "https://moviesverse.cc/";
    String olamovies = "https://olamovies.one/";
    String movieshub = "https://movieshub.fit/";
    String moviesflixpro = "https://moviesflixpro.me/";
    String vegamovies = "https://vegamovies.guru/";
    String hdhub4u = "https://hdhub4u.cam/";
    String ninexmovies = "https://9xmovies.plus/";
    String movies123 = "https://movies123.studio/";
    String world4ufree1 = "https://world4ufree1.co/";
    String katmoviehd = "https://katmoviehd.so/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_privatemoviez = findViewById(R.id.btn_privatemoviez);
        btn_moviesverse = findViewById(R.id.btn_moviesverse);
        btn_moviesflixpro = findViewById(R.id.btn_moviesflixpro);
        btn_olamovies = findViewById(R.id.btn_olamovies);
        btn_movieshub = findViewById(R.id.btn_movieshub);
        btn_vegamovies = findViewById(R.id.btn_vegamovies);
        btn_hdhub4u = findViewById(R.id.btn_hdhub4u);
        btn_9xmovies = findViewById(R.id.btn_9xmovies);
        btn_movies123 = findViewById(R.id.btn_movies123);
        btn_world4ufree1 = findViewById(R.id.btn_world4ufree1);
        btn_katmoviehd = findViewById(R.id.btn_katmoviehd);

        btn_privatemoviez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("private",privatemovie);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "privatemovie open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_moviesverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("moviesverse",moviesverse);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "movies verse open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_moviesflixpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("moviesflixpro",moviesflixpro);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "movies flix pro open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_olamovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("olamovies",olamovies);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "ola movies open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_movieshub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("movieshub",movieshub);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "movies hub open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_vegamovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("vegamovies",vegamovies);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "vega movies open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_hdhub4u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("hdhub4u",hdhub4u);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "hd hub 4u open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_9xmovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("ninexmovies",ninexmovies);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "9xmovies open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_movies123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("movies123",movies123);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "movies123 open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_world4ufree1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("world4ufree1",world4ufree1);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "world 4u free1 open " , Toast.LENGTH_SHORT).show();
            }
        });
        btn_katmoviehd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webview.class);
                intent.putExtra("katmoviehd",katmoviehd);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "katmoviehd open " , Toast.LENGTH_SHORT).show();
            }
        });
    }
}