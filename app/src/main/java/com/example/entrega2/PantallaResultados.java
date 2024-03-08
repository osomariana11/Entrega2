package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaResultados extends AppCompatActivity {

    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultados);

        txtresultado = findViewById(R.id.txtresultado);

        double resultado =getIntent().getDoubleExtra("resultado", 0.0);

        txtresultado.setText("Resultado: " + resultado);
    }

}
