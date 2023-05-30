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

public class TelaReferencia extends AppCompatActivity {

    Button TxtOnibus, TxtMapa, TxtCasa, TxtMercado, TxtFaculdades, TxtCalculadora;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_referencia);

        Toolbar toolbar = findViewById(R.id.toolbar_referencia);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TxtOnibus = findViewById(R.id.TxtOnibus);

        TxtOnibus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.freepik.com/vetores-gratis/ilustracao-do-conceito-de-motorista-de-onibus_14565642.htm#query=onibus&position=4&from_view=search&track=robertav1_2_sidr%22%3EImagem%20de%20storyset%3C/a%3E%20no%20Freepik")));
            }
        });

        TxtMapa= findViewById(R.id.TxtMapa);

        TxtMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freepik.com/free-vector/map-with-compass-design_1106029.htm#query=mapa%20desenho&position=14&from_view=search&track=robertav1_2_sidr%22%3EFreepik%3C/a%3E")));
            }
        });

        TxtCasa = findViewById(R.id.TxtCasa);

        TxtCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.freepik.com/vetores-gratis/bela-casa_4979878.htm#query=casas&position=6&from_view=search&track=robertav1_2_sidr%22%3EImagem%20de%20studiogstock%3C/a%3E%20no%20Freepik")));
            }
        });

        TxtMercado = findViewById(R.id.TxtMercado);

        TxtMercado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freepik.com/free-vector/support-local-farmers-concept_9263498.htm#query=mercados%20desenho&position=2&from_view=search&track=robertav1_2_sidr")));
            }
        });

        TxtFaculdades = findViewById(R.id.TxtFaculdades);

        TxtFaculdades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.freepik.com/vetores-gratis/fundo-de-conceito-de-universidade-plana_4672586.htm#query=faculdades&position=16&from_view=search&track=sph\">Freepik</a>")));
            }
        });

        TxtCalculadora = findViewById(R.id.TxtCalculadora);

        TxtCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://br.freepik.com/vetores-gratis/desenho-de-adesivo-com-calculadora-isolada_16511906.htm#query=calculadora&position=15&from_view=search&track=sph\">Imagem de brgfx</a> no Freepik")));
            }
        });
    }
}