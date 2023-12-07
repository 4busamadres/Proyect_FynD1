package com.example.proyect_fynd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Menu_soporte extends AppCompatActivity {
    EditText txt_nombre, txt_correo, txt_problema;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soporte);
        txt_nombre=findViewById(R.id.txt_soporte_nombre);
        txt_correo=findViewById(R.id.txt_soporte_correo);
        txt_problema=findViewById(R.id.txt_soporte_problema);
        db=FirebaseFirestore.getInstance();
    }
    public void mostrarAlerta(String titulo, String mensaje)
    {
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle(titulo);
        alerta.setMessage(mensaje);
        alerta.setPositiveButton("Aceptar", null);
        AlertDialog dialogo=alerta.create();
        dialogo.show();
    }
    public void gestionarProblema(View v)
    {
        String nombre=txt_nombre.getText().toString();
        String correo= txt_correo.getText().toString();
        String problema=txt_problema.getText().toString();
        Map<String,Object> map =new HashMap<>();
        map.put("nombre", nombre);
        map.put("correo",correo);
        map.put("problema", problema);
        db.collection("soporte"). add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                mostrarAlerta("Soporte Tecnico","Requerimiento registrado correctamente");

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                mostrarAlerta("Soporte Tecnico", "Algo sucedio, requerimiento no ingresado"+ e.getMessage());

            }
        });

    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_soporte.this, Menu.class);
        startActivity(volver_menu);
    }
}