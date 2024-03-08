package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class Seno extends AppCompatActivity {

    EditText angulo_seno;
    RadioButton R_grados;
    RadioButton R_radianes;
    Button calcular_seno;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seno);


        angulo_seno = findViewById(R.id.txtanguloseno);
        R_grados = findViewById(R.id.optiongradosseno);
        R_radianes = findViewById(R.id.optionradianesseno);
        calcular_seno = findViewById(R.id.btncalcularseno);
        resultado = findViewById(R.id.lbladvertenciaseno);

        calcular_seno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double angle = Double.parseDouble(angulo_seno.getText().toString());

                if (R_grados.isChecked()) {
                    double radians = Math.toRadians(angle);
                    double sinValue = Math.sin(radians);
                    Intent intent = new Intent(Seno.this, PantallaResultados.class);
                    intent.putExtra("resultado", sinValue);
                    startActivity(intent);
                }
                else if (R_radianes.isChecked()) {
                    double sinValue = Math.sin(angle);
                    Intent intent = new Intent(Seno.this, PantallaResultados.class);
                    intent.putExtra("resultado", sinValue);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Selecciona el tipo de ángulo.");
                }
            }
        });

    }
}