package br.com.g4it.aula0401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    ListView listaPares;
    ListView listaImpares;
    List<String> pares = new ArrayList<String>();
    ArrayAdapter<String> adapterPares;
    List<String> impares = new ArrayList<String>();
    ArrayAdapter<String> adapterImpares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText)findViewById(R.id.numero);

        listaPares = (ListView)findViewById(R.id.listaPares);
        adapterPares = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                pares);
        listaPares.setAdapter(adapterPares);

        listaImpares = (ListView)findViewById(R.id.listaImpares);
        adapterImpares = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                impares);
        listaImpares.setAdapter(adapterImpares);
    }

    public void validaNumero(View v){
        int num = Integer.parseInt(numero.getText().toString());
        int result = num % 2;

        if (result == 0){
            pares.add(num + " é um número par!");
            adapterPares.notifyDataSetChanged();
        } else {
            impares.add(num + " é um número ímpar!");
            adapterImpares.notifyDataSetChanged();
        }

       numero.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
