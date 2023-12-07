package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

public class Menu_registrar_usurious extends AppCompatActivity {
private FirebaseFirestore db;
EditText txt_nombre, txt_apellido, txt_correo, txt_clave, sp_genero, txt_nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registrar_usuario);
        db = FirebaseFirestore.getInstance();
        txt_nombre=findViewById(R.id.txt_registro_nombre);
        txt_apellido=findViewById(R.id.txt_registro_apellido);
        txt_correo=findViewById(R.id.txt_registro_correo);
        txt_clave=findViewById(R.id.txt_registro_clave);
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_registrar_usurious.this, Menu.class);
        startActivity(volver_menu);
    }
}