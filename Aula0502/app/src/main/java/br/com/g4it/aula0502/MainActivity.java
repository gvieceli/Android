package br.com.g4it.aula0502;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    private Boolean logado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validaLogin(View v){
        SharedPreferences prefs = getSharedPreferences("arquivoProps",
                MODE_PRIVATE);
        logado = prefs.getBoolean("propriedade_1", false);

        if (logado == true) {
            Intent abrePrincipal = new Intent(getBaseContext(),Principal.class);
            startActivity(abrePrincipal);
        } else {
            Intent abreLogin = new Intent(getBaseContext(),Login.class);
            startActivity(abreLogin);
        }

    }
}
