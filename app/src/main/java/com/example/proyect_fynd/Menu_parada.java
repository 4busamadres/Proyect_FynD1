package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu_parada extends AppCompatActivity {
    private FirebaseFirestore db;
    ListView lv_paradas;
    private ParadaAdapter paradaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_parada);
        db= FirebaseFirestore.getInstance();
        lv_paradas=findViewById(R.id.lv_paradas);

        // Inicializar el adaptador y asignar a la ListView
        paradaAdapter = new ParadaAdapter(this, new ArrayList<>());
        lv_paradas.setAdapter(paradaAdapter);

        // Llamar a tu método para registrar paradas
        registrarParada();
    }
    public void registrarParada()
    {
        Map<String, Object> map = new HashMap<>();
        map.put("nomParada", "Mendoza / Rengo");

        // Añadir la parada al ArrayList y notificar al adaptador
        paradaAdapter.addParada(map);
        paradaAdapter.notifyDataSetChanged();

    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_parada.this, Menu.class);
        startActivity(volver_menu);
    }
}