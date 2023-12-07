package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Menu_soporte extends AppCompatActivity {
    EditText txt_nombre, txt_correo, txt_problema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soporte);
        txt_nombre=findViewById(R.id.txt_soporte_nombre);
        txt_correo=findViewById(R.id.txt_soporte_correo);
        txt_problema=findViewById(R.id.txt_soporte_problema);
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_soporte.this, Menu.class);
        startActivity(volver_menu);
    }
}