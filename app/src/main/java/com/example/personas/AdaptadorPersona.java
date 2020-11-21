package com.example.personas;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPersona extends BaseAdapter {
    private Context contexto;
    private ArrayList<Personas> personas;
    private Resources res;

    public AdaptadorPersona(Context contexto,ArrayList<Personas> personas){
        this.contexto=contexto;
        this.personas=personas;
    }
    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int position) {
        return personas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Definir las variables a usar
        res=contexto.getResources();
        View v= convertView;

        //
        LayoutInflater inf=(LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageView foto=v.findViewById(R.id.imgfoto);
        TextView cedula=v.findViewById(R.id.lblCedulap);
        TextView nombre=v.findViewById(R.id.lblNombrep);
        TextView apellido =v.findViewById(R.id.lblApellidop);

        // creamos un objeto Persona
        Personas p= personas.get(position);

        //Setear los elementos a la vista

        foto.setImageDrawable(res.getDrawable(p.))
        cedula.setText(p.getCedula());
        nombre.setText(p.getNombre());
        apellido.setText(p.getApellido());
      return v;
    }
}
