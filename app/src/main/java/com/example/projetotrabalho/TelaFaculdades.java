package com.example.projetotrabalho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaFaculdades extends AppCompatActivity {

    ImageView btnUsc, btnUnesp, btnFib, btnUninove, btnIte, btnUnip, btnUsp, btnAnhanguera, btnMostrarMapaFaculdades;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_faculdades);

        Toolbar toolbar = findViewById(R.id.toolbar_encontre);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnUsc = findViewById(R.id.btnUsc);
        btnUsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://unisagrado.edu.br/todos-os-cursos")));
            }
        });

        btnUnesp = findViewById(R.id.btnUnesp);
        btnUnesp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fc.unesp.br/#!/ensino/graduacao/cursos/")));
            }
        });

        btnFib = findViewById(R.id.btnFib);
        btnFib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://fibbauru.br/site/conteudo/graduacao")));
            }
        });

        btnUninove = findViewById(R.id.btnUninove);
        btnUninove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uninove.br/unidades/coligada/faculdade-nove-de-julho-bauru")));
            }
        });

        btnIte = findViewById(R.id.btnIte);
        btnIte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ite.edu.br/cursos-oferecidos")));
            }
        });

        btnUnip = findViewById(R.id.btnUnip);
        btnUnip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://unip.br/cursos/index.aspx")));
            }
        });

        btnUsp = findViewById(R.id.btnUsp);
        btnUsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://graduacao.fob.usp.br/pb/cursos/")));
            }
        });

        btnAnhanguera = findViewById(R.id.btnAnhanguera);
        btnAnhanguera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.anhanguera.com/cursos?utm_source=google&utm_medium=cpc&utm_campaign=AEDU::L1::Performance::CPA::PIM&gclid=CjwKCAjwl6OiBhA2EiwAuUwWZVSjVwQmENLK7Bo-LWyXE4ZguvkfbGK2wbhBHbwX7Rls6v6Vy5mi0RoC-_kQAvD_BwE&gclsrc=aw.ds&preco=1016")));
            }
        });

        btnMostrarMapaFaculdades = findViewById(R.id.btnMostrarMapaFaculdades);

        btnMostrarMapaFaculdades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaFaculdades.this, MapsFaculdades.class);
                startActivity(intent);
            }
        });

    }
}