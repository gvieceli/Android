package br.com.g4it.aula0203;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.util.*;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        int idade = getIntent().getIntExtra("idade",-1);
        float altura = getIntent().getFloatExtra("altura", 2);
        String nome = getIntent().getStringExtra("nome");

        Toast.makeText(getBaseContext(),"Olá " + nome, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("Principal", "Metodo onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Principal","Metodo onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Principal","Metodo onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Principal","Metodo onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Principal","Metodo onDestroy");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    public void finish(View botao){
        finish();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
