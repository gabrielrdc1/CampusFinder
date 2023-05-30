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

public class TelaMoradias extends AppCompatActivity {

    ImageView btnMostrarMapaMoradias;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_moradias);

        Toolbar toolbar = findViewById(R.id.toolbar_encontre3);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMostrarMapaMoradias = findViewById(R.id.btnMostrarMapaMoradias);

        btnMostrarMapaMoradias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/search/republica+perto+de+Bauru,+SP/@-22.3369008,-49.0612674,14z")));
            }
        });
    }
}