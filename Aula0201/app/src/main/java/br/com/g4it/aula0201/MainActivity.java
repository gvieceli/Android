package br.com.g4it.aula0201;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.util.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText v1;
    EditText v2;
    EditText resultado;
    ListView lista;
    List<String> resultados = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = (EditText)findViewById(R.id.v1);
        v2 = (EditText)findViewById(R.id.v2);
        resultado = (EditText)findViewById(R.id.resultado);
        lista = (ListView)findViewById(R.id.lista);
        adapter = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                resultados);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Você clicou na posição " + position + " valor " + resultados.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void clear(){
        v1.setText("");
        v2.setText("");
        resultado.setText("");
    }

    public void soma(View v){
        float valor1 = Float.parseFloat(v1.getText().toString());
        float valor2 = Float.parseFloat(v2.getText().toString());
        float res = valor1 + valor2;

        resultado.setText(toString().valueOf(res));
        resultados.add("Resultado da soma de " + valor1 + " e " + valor2 + " é " + res);
        adapter.notifyDataSetChanged();
        Log.v("Alerta", "Resultado da soma: " + res);
    }

    public void subtracao(View v){
        float valor1 = Float.parseFloat(v1.getText().toString());
        float valor2 = Float.parseFloat(v2.getText().toString());
        float res = valor1 - valor2;

        resultado.setText(toString().valueOf(res));
        resultados.add("Resultado da subtração de " + valor1 + " menos " + valor2 + " é " + res);
        adapter.notifyDataSetChanged();
        Log.v("Alerta", "Resultado da subtração: " + res);
    }

    public void multiplicacao(View v){
        float valor1 = Float.parseFloat(v1.getText().toString());
        float valor2 = Float.parseFloat(v2.getText().toString());
        float res = valor1 * valor2;

        resultado.setText(toString().valueOf(res));
        resultados.add("Resultado da multiplicação de " + valor1 + " por " + valor2 + " é " + res);
        adapter.notifyDataSetChanged();
        Log.v("Alerta", "Resultado da multiplicação: " + res);
    }

    public void divisao(View v){
        float valor1 = Float.parseFloat(v1.getText().toString());
        float valor2 = Float.parseFloat(v2.getText().toString());
        float res = valor1 / valor2;

        if (valor2 != 0.0) {
            resultado.setText(toString().valueOf(res));
            resultados.add("Resultado da divisão de " + valor1 + " por " + valor2 + " é " + res);
            adapter.notifyDataSetChanged();
            Log.v("Alerta", "Resultado da divisão: " + res);
        } else {
            resultado.setText("Coloque um número válido no campo 2");
            Log.v("Alerta", "Valor inválido no campo 2");
        }
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
