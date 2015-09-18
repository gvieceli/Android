package br.com.g4it.aula0401;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.lang.*;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText somaPares;
        EditText somaImpares;

        Bundle extras = getIntent().getExtras();

        somaPares = (EditText) findViewById(R.id.somaPares);
        Float somaPar = extras.getFloat("somaPar");
        somaPares.setText(somaPar.toString());

        somaImpares = (EditText) findViewById(R.id.somaImpares);
        Float somaImpar = extras.getFloat("somaImpar");
        somaImpares.setText(somaImpar.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
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

    public void voltaPrincipal(View v){
        Intent voltaPrincipal = new Intent(getBaseContext(),MainActivity.class);
        startActivity(voltaPrincipal);
    }
}
