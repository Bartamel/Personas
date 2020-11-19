package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        cedula=findViewById(R.id.txtCedula);
        nombre=findViewById(R.id.txtNombre);
        apellido=findViewById(R.id.txtApellido);

    }
    public void guardar(View v){
        String ced, nom, apel;
        Personas p;

        ced=cedula.getText().toString();
        nom=nombre.getText().toString();
        apel=apellido.getText().toString();
        p= new Personas(ced,nom,apel);
        p.guardar();
        Toast.makeText(this, R.string.mensaje_guardad_exitosamente, Toast.LENGTH_LONG).show();
        limpiar();
    }
    public void limpiar(View v){
        limpiar();
    }
    public void limpiar(){
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.requestFocus();
    }
}