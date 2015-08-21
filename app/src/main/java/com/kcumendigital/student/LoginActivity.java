package com.kcumendigital.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nom_usuario, pass_usuario;
    private Button btn_user;
    private static final String USUARIO = "manuel";
    private static final String PASSWORD = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nom_usuario = (EditText) findViewById(R.id.nom_usuario);
        pass_usuario = (EditText) findViewById(R.id.pass_usuario);

        btn_user = (Button) findViewById(R.id.btn_login_usuario);
        btn_user.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String nombre_usuario = nom_usuario.getText().toString();
        String password = pass_usuario.getText().toString();

        if (nombre_usuario.equals("") || password.equals("")){
            Toast.makeText(this, "Llena los campos para poder ingresar", Toast.LENGTH_SHORT).show();
        }else{
            if (nombre_usuario.equals(USUARIO) && password.equals(PASSWORD)){

                Intent intent = new Intent(this, DashboardActivity.class);
                startActivity(intent);

            }else {
                Toast.makeText(this, "Credenciales incorrectos", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
