package com.example.projetotrabalho;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCreditos;
    Button btnEntrar;
    Button btnSobreApp;

    Button btnReferencias;
    Button btnMapaBauru;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreditos = findViewById(R.id.btnCreditos);
        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, telaCreditos.class);
                startActivity(in);
            }
        });

        btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaEncontra.class);
                startActivity(in);
            }
        });
        btnSobreApp = findViewById(R.id.btnSobreApp);
        btnSobreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, sobreAplicativo.class);
                startActivity(in);
            }
        });

        btnMapaBauru = findViewById(R.id.btnMostrarMapa);

        btnMapaBauru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bauru,+SP/@-22.3045501,-49.1434844,12.25z/data=!4m6!3m5!1s0x94bf689c0ddaa221:0x251c368f6fa134a0!8m2!3d-22.3155297!4d-49.0708221!16zL20vMDN4enBk")));
            }
        });

        btnReferencias = findViewById(R.id.btnReferencias);
        btnReferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TelaReferencia.class);
                startActivity(in);
            }
        });
    }
}