package com.example.projetotrabalho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaMercados extends AppCompatActivity {

    ImageView btnMostrarMapaMercados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_mercados);

        Toolbar toolbar = findViewById(R.id.toolbar_encontre);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMostrarMapaMercados = findViewById(R.id.btnMostrarMapaMercados);

        btnMostrarMapaMercados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/search/supermercados+/@-22.3565606,-49.0905179,14z/data=!3m1!4b1")));
            }
        });
    }
}