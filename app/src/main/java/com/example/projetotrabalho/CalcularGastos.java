package com.example.projetotrabalho;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalcularGastos extends AppCompatActivity {
    EditText Mercados2, Faculdades2, Moradias2, Transportes2, Resultado2;

    TextView Mercados, Faculdades, Moradias, Transportes, Resultado;
    Button botao;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_gastos);

        Mercados = (TextView) findViewById(R.id.edtMercados);
        Moradias = (TextView) findViewById(R.id.edtMoradias);
        Transportes = (TextView) findViewById(R.id.edtTransportes);
        Faculdades = (TextView) findViewById(R.id.edtFaculdades);
        Resultado = (TextView) findViewById(R.id.edtResultado);
        botao = (Button) findViewById(R.id.btnCalcularGastos);
        Mercados2 = (EditText) findViewById(R.id.edtMercados2);
        Moradias2 = (EditText) findViewById(R.id.edtMoradias2);
        Transportes2 = (EditText) findViewById(R.id.edtTransportes2);
        Faculdades2 = (EditText) findViewById(R.id.edtFaculdades2);
        Resultado2 = (EditText) findViewById(R.id.edtResultado2);

    }

        public void somar(View view){
            int valorMercados = Integer.parseInt(Mercados2.getText().toString());
            int valorMoradias = Integer.parseInt(Moradias2.getText().toString());
            int valorTransportes = Integer.parseInt(Transportes2.getText().toString());
            int valorFaculdades = Integer.parseInt(Faculdades2.getText().toString());
            Resultado2.setText(String.valueOf((valorMercados + valorMoradias + valorTransportes + valorFaculdades)));
        }


}