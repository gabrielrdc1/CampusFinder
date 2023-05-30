package com.example.projetotrabalho;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Text;

public class CalcularGastos extends AppCompatActivity {
    EditText Mercados2, Faculdades2, Moradias2, Transportes2;

    TextView Resultado, Resultado2;;
    Button botao;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_gastos);

        Toolbar toolbar = findViewById(R.id.toolbar_encontre2);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Resultado = (TextView) findViewById(R.id.edtResultado);
        botao = (Button) findViewById(R.id.btnCalcularGastos);
        Mercados2 = (EditText) findViewById(R.id.edtMercados2);
        Moradias2 = (EditText) findViewById(R.id.edtMoradias2);
        Transportes2 = (EditText) findViewById(R.id.edtTransportes2);
        Faculdades2 = (EditText) findViewById(R.id.edtFaculdades2);
        Resultado2 = (TextView) findViewById(R.id.edtResultado2);

    }

    public void somar(View view){
        String mercados = Mercados2.getText().toString();
        String moradias = Moradias2.getText().toString();
        String transportes = Transportes2.getText().toString();
        String faculdades = Faculdades2.getText().toString();

        if(mercados.isEmpty() || moradias.isEmpty() || transportes.isEmpty() || faculdades.isEmpty()) {
            Toast.makeText(this, "Por favor, preencha todos os valores.", Toast.LENGTH_SHORT).show();
        } else {
            double valorMercados = Double.parseDouble(mercados.replace(",", "."));
            double valorMoradias = Double.parseDouble(moradias.replace(",", "."));
            double valorTransportes = Double.parseDouble(transportes.replace(",", "."));
            double valorFaculdades = Double.parseDouble(faculdades.replace(",", "."));
            double resultado = valorMercados + valorMoradias + valorTransportes + valorFaculdades;
            Resultado2.setText("R$ " + String.format("%.2f", resultado));
        }
    }



}