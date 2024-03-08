package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Raiz extends AppCompatActivity {

    EditText num;
    Button calcularRaiz;
    TextView resultadoRaiz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);

        EditText num = findViewById(R.id.txtnumero);
        Button calcularRaiz = findViewById(R.id.btncalcularraiz);
        TextView resultadoRaiz = findViewById(R.id.lbladvertenciaraiz);

        calcularRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String numberString = num.getText().toString();
                if (!numberString.isEmpty()) {
                    double number = Double.parseDouble(numberString);
                    double sqrt = Math.sqrt(number);
                    Intent intent = new Intent(Raiz.this, PantallaResultados.class);
                    intent.putExtra("resultado", sqrt);
                    startActivity(intent);
                }
                else {
                    resultadoRaiz.setText("Por favor, ingrese un número para sacar su raíz.");
                }
            }
        });

    }
}