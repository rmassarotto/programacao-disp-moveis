package com.example.snackbarexemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Snackbar snackbar;
    private Button buttonSnack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activity_main);

        snackbar = Snackbar.make(view, "Da um desconto pelo atraso Professor!! :)", snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(5000);

        buttonSnack = findViewById(R.id.buttonSnackbar);

        buttonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.show();
            }
        });



    }
}
