package com.example.a07controlesbsicosui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado = null;
    private Button btnRegistrar = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Registrando....", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnLogin:
                Toast.makeText(getApplicationContext(), "Login....", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnCancelar:
                Toast.makeText(getApplicationContext(), "Cancelando....", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
