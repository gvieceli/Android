package br.com.g4it.aula0502;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;
import android.widget.*;

public class Login extends AppCompatActivity {

    EditText user;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        Intent abrePrincipal = new Intent(getBaseContext(),Principal.class);

        user = (EditText)findViewById(R.id.usuario);
        password  = (EditText)findViewById(R.id.senha);

        String usr = user.getText().toString();
        String pass = password.getText().toString();

        SharedPreferences prefs = getSharedPreferences("arquivoProps",
                MODE_PRIVATE);

        if (usr.equals("admin") && pass.equals("123")) {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("propriedade_1", true);
            editor.commit();

            startActivity(abrePrincipal);
        } else {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("propriedade_1", false);
            editor.commit();

            Toast.makeText(getBaseContext(),"Login inválido! " + usr + " " + pass,Toast.LENGTH_SHORT).show();
        }

    }

}
