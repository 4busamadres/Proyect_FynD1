package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrir_registro(View v){
        Intent abrir_registro = new Intent(MainActivity.this, form_editar_registro.class);
        startActivity(abrir_registro);
    }
    public void abrir_menu(View v){
        Intent abrir_menu = new Intent(MainActivity.this,Menu.class);
        startActivity(abrir_menu);
    }
    public void abrir_ingresar_google(View view) {
        String url = "https://accounts.google.com/Login";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
    public void abrir_ajustes(View view) {
        Intent abrir_ajustes = new Intent(MainActivity.this, Menu_ajuste.class);
        startActivity(abrir_ajustes);
    }

}