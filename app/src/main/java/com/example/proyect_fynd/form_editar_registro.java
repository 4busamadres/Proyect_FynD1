package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class form_editar_registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_editar_registro);
    }
    public void volver_inicio(View v){
        Intent volver_inicio = new Intent(form_editar_registro.this, MainActivity.class);
        startActivity(volver_inicio);
    }
}