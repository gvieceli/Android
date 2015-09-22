package br.com.g4it.aula0601;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.*;

public class DetalheProduto extends AppCompatActivity {

    TextView nomeProduto;
    TextView codigoProduto;
    TextView precoProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhe_produto);

        nomeProduto = (TextView)findViewById(R.id.nomeProdutoSelecionado);
        codigoProduto = (TextView)findViewById(R.id.codigoProdutoSelecionado);
        precoProduto = (TextView)findViewById(R.id.precoProdutoSelecionado);

        SharedPreferences prefs = getSharedPreferences("arquivoProps",
                MODE_PRIVATE);

        nomeProduto.setText(prefs.getString("nomeProduto","nome"));
        codigoProduto.setText(prefs.getString("codigoProduto","codigo"));
        precoProduto.setText(prefs.getString("precoProduto","preco"));
    }

    public void voltar(View v){
        Intent voltaPrincipal = new Intent(getBaseContext(),MainActivity.class);
        startActivity(voltaPrincipal);
    }
}
