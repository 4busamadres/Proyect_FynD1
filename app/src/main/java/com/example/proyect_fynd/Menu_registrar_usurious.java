package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

public class Menu_registrar_usurious extends AppCompatActivity {
private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registrar_usuario);
        db = FirebaseFirestore.getInstance();
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_registrar_usurious.this, Menu.class);
        startActivity(volver_menu);
    }
}