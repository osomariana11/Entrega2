package com.example.entrega2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    Button botonSeno;
    Button botonCoseno;
    Button botonRaiz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSeno = findViewById(R.id.btnseno);
        botonCoseno = findViewById(R.id.btncoseno);
        botonRaiz = findViewById(R.id.btnraiz);


        botonSeno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Seno.class);
                startActivity(intent);
            }
        });
        botonCoseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Coseno.class);
                startActivity(intent);
            }
        });
        botonRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Raiz.class);
                startActivity(intent);
            }
        });





    }



}