package com.rolando.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText numero;
    Button calcular;
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (EditText) findViewById(R.id.txtValor);
        calcular = (Button) findViewById(R.id.btnCalcular);
        mostrar = (TextView) findViewById(R.id.txtResultado);
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.btnCalcular:

                String numHoras = numero.getText().toString();

                if (!numHoras.isEmpty()) {
                    double aux = Double.parseDouble(numHoras);
                    int hora = (int) aux;
                    aux = 60d * (aux - hora);
                    int minutos = (int) aux;
                    aux = 60d * (aux - minutos);
                    int segundos= (int) aux;
                    aux = 10d * (aux - segundos);
                    int deSeg = (int) aux;

                    mostrar.setText("Horas: " + hora + "\nMinutos: " + minutos + "\nSegundos: " + segundos + "\nDecimos de segundos: " + deSeg+"\nTiempo ordenado "+hora+":"+minutos+":"+segundos+":"+deSeg);
                    mostrar.setVisibility(View.VISIBLE);

                } else {
                    mostrar.setText("Ingresa un valor");
                    mostrar.setVisibility(View.VISIBLE);
                }

        }

    }

}
