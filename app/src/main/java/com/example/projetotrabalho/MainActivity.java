package com.example.projetotrabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMercados;
    Button btnMoradias;
    Button btnTransportes;
    Button btnFaculdades;

    Button btnCalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMercados = findViewById(R.id.btnMercados);

        btnMercados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaMercados.class);
                startActivity(in);
            }
        });

        btnMoradias = findViewById(R.id.btnMoradias);

        btnMoradias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaMoradias.class);
                startActivity(in);
            }
        });


        btnTransportes = findViewById(R.id.btnTransportes);

        btnTransportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaTransportes.class);
                startActivity(in);
            }
        });

        btnFaculdades = findViewById(R.id.btnFaculdades);

        btnFaculdades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaFaculdades.class);
                startActivity(in);
            }
        });

        btnCalcula = findViewById(R.id.btnCalcula);
        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, CalcularGastos.class);
                startActivity(in);
            }
        });


    }
}