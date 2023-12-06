package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu.this, MainActivity.class);
        startActivity(volver_menu);
    }
    public void abrir_parada(View v){
        Intent abrir_parada=new Intent(Menu.this, Menu_parada.class);
        startActivity(abrir_parada);
    }
    public void abrir_linea(View v){
        Intent abrir_linea=new Intent(Menu.this, Menu_lineas.class);
        startActivity(abrir_linea);
    }
    public void abrir_ajuste(View v){
        Intent abrir_ajuste=new Intent(Menu.this, Menu_ajuste.class);
        startActivity(abrir_ajuste);
    }
    public void abrir_favorito(View v){
        Intent abrir_favorito=new Intent(Menu.this, Menu_favorito.class);
        startActivity(abrir_favorito);
    }
    public void abrir_soporte(View v){
        Intent abrir_soporte=new Intent(Menu.this, Menu_soporte.class);
        startActivity(abrir_soporte);
    }
    public void abrir_registro_usuario(View v){
        Intent abrir_registro_usuario=new Intent(Menu.this, Menu_editar_usuario.class);
        startActivity(abrir_registro_usuario);
    }

}