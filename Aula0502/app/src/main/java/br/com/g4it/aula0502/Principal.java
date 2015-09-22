package br.com.g4it.aula0502;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void voltar(View v){
        Intent abreMain = new Intent(getBaseContext(),MainActivity.class);
        startActivity(abreMain);
    }

    public void logoff(View v){
        Intent abreMain = new Intent(getBaseContext(),MainActivity.class);

        SharedPreferences prefs = getSharedPreferences("arquivoProps",
                MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("propriedade_1", false);
        editor.commit();

        startActivity(abreMain);
     }
}
