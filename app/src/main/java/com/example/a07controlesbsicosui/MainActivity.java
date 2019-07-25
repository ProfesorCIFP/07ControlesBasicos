package com.example.a07controlesbsicosui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado = null;
    private EditText etNombre = null;
    private EditText etEmail = null;
    private EditText etPassword = null;
    private Button btnRegistrar = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String datos = recogeDatosInsertados();
                textResultado.setText("-- Registrando -- \n" + datos);
            }
        });
    }


    public void onClick(View view) {
        String datos;
        switch (view.getId()) {
            case R.id.btnLogin:
                datos = recogeDatosInsertados();
                textResultado.setText("-- Login -- \n" + datos);
                break;

            case R.id.btnCancelar:
                datos = recogeDatosInsertados();
                textResultado.setText("-- Cancelando -- \n" + datos);
                break;
        }
    }

    private String recogeDatosInsertados() {
        String datos = "";

        datos += "Nombre: " + etNombre.getText() + "\n";
        datos += "Email: " + etEmail.getText() + "\n";
        datos += "Password: " + etPassword.getText() + "\n";

        return datos;
    }
}
