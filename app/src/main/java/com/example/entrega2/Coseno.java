package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class Coseno extends AppCompatActivity {


    EditText angulo_coseno;
    Button calcular_coseno;
    TextView resultado;
    RadioButton R_grados;
    RadioButton R_radianes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coseno);


        angulo_coseno = findViewById(R.id.txtangulocoseno);
        calcular_coseno = findViewById(R.id.btncalcularcoseno);
        resultado = findViewById(R.id.lbladvertenciacoseno);
        R_grados = findViewById(R.id.optiongradoscoseno);
        R_radianes = findViewById(R.id.optionradianescoseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = angulo_coseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = R_grados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(Coseno.this, PantallaResultados.class);
                    intent.putExtra("resultado", coseno);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Ingresa un ángulo para poder continuar.");
                }
            }
        });

    }
}