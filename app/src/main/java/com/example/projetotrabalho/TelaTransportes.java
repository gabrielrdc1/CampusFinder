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

public class TelaTransportes extends AppCompatActivity {


    ImageView btnMostrarMapaTransportes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_transportes);

        Toolbar toolbar = findViewById(R.id.toolbar_encontre4);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMostrarMapaTransportes = findViewById(R.id.btnMostrarMapaTransportes);

        btnMostrarMapaTransportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/search/pontos+de+onibus+bauru/@-22.3439359,-49.1067722,12.75z")));
            }
        });
    }
}