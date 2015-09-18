package br.com.g4it.aula0401;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.util.*;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    ListView listaPares;
    ListView listaImpares;
    List<Float> pares = new ArrayList<Float>();
    ArrayAdapter<Float> adapterPares;
    List<Float> impares = new ArrayList<Float>();
    ArrayAdapter<Float> adapterImpares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText)findViewById(R.id.numero);

        listaPares = (ListView)findViewById(R.id.listaPares);
        adapterPares = new ArrayAdapter<Float>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                pares);
        listaPares.setAdapter(adapterPares);

        listaImpares = (ListView)findViewById(R.id.listaImpares);
        adapterImpares = new ArrayAdapter<Float>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                impares);
        listaImpares.setAdapter(adapterImpares);

        listaImpares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Você clicou na posição " + position + " valor " + impares.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });

        listaPares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Você clicou na posição " + position + " valor " + pares.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void validaNumero(View v){
        float num = Integer.parseInt(numero.getText().toString());
        float result = num % 2;

        if (result == 0){
            pares.add(num);
            adapterPares.notifyDataSetChanged();
        } else {
            impares.add(num);
            adapterImpares.notifyDataSetChanged();
        }

        numero.setText("");

    }

    public void abreResultado(View v){
        Intent abreResultado = new Intent(getBaseContext(),Main2Activity.class);

        float somaPar = 0;
        float somaImpar = 0;

        for (float i : pares) {
            somaPar = somaPar + i;
        }

        for (float i : impares) {
            somaImpar = somaImpar + i;
        }

        Log.v("Soma Par","" + somaPar);
        Log.v("Soma Impar",""+ somaImpar);

        abreResultado.putExtra("somaPar", somaPar);
        abreResultado.putExtra("somaImpar", somaImpar);
        startActivity(abreResultado);
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
