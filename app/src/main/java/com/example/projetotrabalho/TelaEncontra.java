package com.example.projetotrabalho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaEncontra extends AppCompatActivity {

     ImageView btnMercados, btnMoradias, btnTransportes, btnFaculdades, btnCalcula;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_encontra);;

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnMercados = findViewById(R.id.btnMercados);

        btnMercados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaEncontra.this, TelaMercados.class);
                startActivity(in);
            }
        });

        btnMoradias = findViewById(R.id.btnMoradias);

        btnMoradias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaEncontra.this, TelaMoradias.class);
                startActivity(in);
            }
        });


        btnTransportes = findViewById(R.id.btnTransportes);

        btnTransportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaEncontra.this, TelaTransportes.class);
                startActivity(in);
            }
        });

        btnFaculdades = findViewById(R.id.btnFaculdades);

        btnFaculdades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaEncontra.this, TelaFaculdades.class);
                startActivity(in);
            }
        });

        btnCalcula = findViewById(R.id.btnCalcula);
        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TelaEncontra.this, CalcularGastos.class);
                startActivity(in);
            }
        });
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onContextItemSelected(item);
    }
}