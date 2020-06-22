package com.example.passadadojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                Usuario usuario = new Usuario("Rodrigo", "rodrigo.ti@grupointegrado.br");

                intent.putExtra("nome", "Rodrigo Oliveira");
                intent.putExtra("idade", 25);
                intent.putExtra("objUsuario", usuario);
                startActivity(intent);
            }
        });
    }
}
