package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_editar_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_editar_usuario);
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_editar_usuario.this, Menu.class);
        startActivity(volver_menu);
    }
}