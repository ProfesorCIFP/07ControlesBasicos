package com.example.a07controlesbsicosui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado = null;
    private EditText etNombre = null;
    private EditText etEmail = null;
    private EditText etPassword = null;
    private CheckBox cbMayorEdad = null;
    private CheckBox cbPoliticas = null;
    private RadioButton rbHombre = null;
    private RadioButton rbMujer = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        cbMayorEdad = findViewById(R.id.cbMayorEdad);
        cbPoliticas = findViewById(R.id.cbPoliticas);
        rbHombre = findViewById(R.id.rbHombre);
        rbMujer = findViewById(R.id.rbMujer);

    }


    public void onClick(View view) {
        String datos;
        switch (view.getId()) {
            case R.id.btnRegistrar:

                if (cbPoliticas.isChecked() & cbMayorEdad.isChecked()) {
                    datos = recogeDatosInsertados();
                    textResultado.setText("-- Registrando -- \n" + datos);
                } else
                    Toast.makeText(getApplicationContext(), "Debes aceptar las políticas de privacidad y ser mayor de edad", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancelar:
                textResultado.setText("-- Cancelando -- \n");
                limpiaCampos();
                break;
        }
    }

    private void limpiaCampos() {
        etNombre.setText("");
        etEmail.setText("");
        etPassword.setText("");
        cbMayorEdad.setChecked(false);
        cbPoliticas.setChecked(true);

    }

    private String recogeDatosInsertados() {
        String datos = "";

        datos += "Nombre: " + etNombre.getText() + "\n";
        datos += "Email: " + etEmail.getText() + "\n";
        datos += "Password: " + etPassword.getText() + "\n";

        if (cbMayorEdad.isChecked())
            datos += "Es mayor de edad \n";
        else
            datos += "NO es mayor de edad \n";

        if (cbPoliticas.isChecked())
            datos += "Acepta las políticas de privacidad \n";
        else
            datos += "NO acepta las políticas de privacidad \n";

        if (rbHombre.isChecked())
            datos += "Sección MASCULINA \n";
        else
            datos += "Sección FEMENINA \n";

        return datos;
    }
}
