package com.example.proyect_fynd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu_parada extends AppCompatActivity {
    private FirebaseFirestore db;
    private ListView lv_paradas;
    private ParadaAdapter paradaAdapter;
    private List<Map<String, Object>> todasLasParadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_parada);
        db= FirebaseFirestore.getInstance();
        lv_paradas=findViewById(R.id.lv_paradas);

        todasLasParadas = new ArrayList<>();
        paradaAdapter = new ParadaAdapter(this, todasLasParadas);
        lv_paradas.setAdapter(paradaAdapter);

        // Llamar a tu método para registrar paradas
        registrarParada();
        EditText txtBuscar = findViewById(R.id.txt_parada_Destino);
        Button btnBuscar = findViewById(R.id.btn_paradas_buscar);

        // Agregar un listener al Button para buscar paradas
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscarParadas(txtBuscar.getText().toString());
            }
        });
    }
    public void registrarParada()
    {
        Map<String, Object> map = new HashMap<>();
        map.put("nomParada", "Mendoza / Rengo");

        // Añadir la parada al ArrayList y notificar al adaptador
        todasLasParadas.add(map);
        paradaAdapter.notifyDataSetChanged();

    }
    private void buscarParadas(String query) {
        List<Map<String, Object>> paradasFiltradas = new ArrayList<>();
        for (Map<String, Object> parada : todasLasParadas) {
            String nomParada = parada.get("nomParada").toString().toLowerCase();
            if (nomParada.contains(query.toLowerCase())) {
                paradasFiltradas.add(parada);
            }
        }
        paradaAdapter.clear();
        paradaAdapter.addAll(paradasFiltradas);
        paradaAdapter.notifyDataSetChanged();
    }
    public void volver_menu(View v){
        Intent volver_menu=new Intent(Menu_parada.this, Menu.class);
        startActivity(volver_menu);
    }
}