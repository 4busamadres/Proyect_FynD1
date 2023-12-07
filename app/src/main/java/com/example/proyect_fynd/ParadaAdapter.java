package com.example.proyect_fynd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

public class ParadaAdapter extends ArrayAdapter<Map<String, Object>> {

    public ParadaAdapter(Context context, List<Map<String, Object>> paradas) {
        super(context, 0, paradas);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Map<String, Object> parada = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_menu_parada, parent, false);
        }

        TextView liv_paradas = convertView.findViewById(R.id.lv_paradas);

        if (parada != null && parada.containsKey("nomParada")) {
            liv_paradas.setText(parada.get("nomParada").toString());
        }

        return convertView;
    }

    // Método para agregar una parada al ArrayList
    public void addParada(Map<String, Object> parada) {
        add(parada);
    }
}
