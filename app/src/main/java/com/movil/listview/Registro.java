package com.movil.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText txtCedula,txtNombre,txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtCedula = findViewById(R.id.txtCedula);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String ced,nomb,apell;
        ced = txtCedula.getText().toString();
        nomb = txtNombre.getText().toString();
        apell = txtApellido.getText().toString();

        Persona p = new Persona(nomb,apell,ced);
        p.guardar();
        Toast.makeText(this,getResources().getString(R.string.mg), Toast.LENGTH_SHORT).show();
        borrar();
    }
    public void borrar(){
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtCedula.setText(null);
    }
    public void limpiar(View v){
        borrar();
    }
}
