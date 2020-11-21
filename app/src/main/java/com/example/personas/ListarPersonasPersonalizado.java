package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPersonasPersonalizado extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Personas> personas;
    private Context contexto;
    private AdaptadorPersona adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas_personalizado);

        lista=findViewById(R.id.lstPersonalizado);
        personas=Datos.obtener();
        adapter=new AdaptadorPersona(this,personas);
        lista.setAdapter(adapter);
    }
}