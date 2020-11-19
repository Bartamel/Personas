package com.example.personas;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Personas> personas=new ArrayList();

    public static void guardar(Personas p){
        personas.add(p);
    }
    public static ArrayList<Personas> obtener(){
        return personas;
    }
}
