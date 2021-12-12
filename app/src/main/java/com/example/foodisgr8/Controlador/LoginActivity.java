package com.example.foodisgr8.Controlador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodisgr8.R;


public class LoginActivity extends AppCompatActivity {

    Button button2;
    View view;
    EditText usuario, clave;
    Intent pasarDePantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        //usuario = (EditText) findViewById(R.id.user);

        //clave = (EditText) findViewById(R.id.password);

        /*
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                 intent.putExtra("usuario",usuario.getText().toString());
                 startActivity(intent);
                 **/
        /*
                Intent intent = new Intent (LoginActivity.this, MainActivity.class);
                Bundle datos = new Bundle();
                datos.putString("usuario",usuario.getText().toString());
                startActivity(intent); */

                /*
                pasarDePantalla = new Intent(getApplicationContext(), MainActivity.class);
                pasarDePantalla.putExtra("usuario", usuario.getText().toString());
                pasarDePantalla.putExtra("clave", Integer.parseInt(clave.getText().toString()));
                startActivity(pasarDePantalla);

            }
        });*/

    }
    /*
    public void AbrirSegundaActivity (View view ){
        Intent abrirActividadDos = new Intent(LoginActivity.this, MainActivity.class);
        abrirActividadDos.putExtra("pasarDatos", "Me gusta Yuta");
        startActivity(abrirActividadDos);
    }
     */
}