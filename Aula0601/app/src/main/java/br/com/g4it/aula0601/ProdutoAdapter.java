package br.com.g4it.aula0601;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android. view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gvieceli on 21/09/15.
 */
public class ProdutoAdapter extends BaseAdapter {

    List<Produto> produtos;
    Context ctx;

    public ProdutoAdapter(Context ctx, List<Produto> produtos) {
        super();
        this.produtos = produtos;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Produto getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // acessar o dado da posi��o
        Produto produto = getItem(position);


        // inflar o layout
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.linha_produto, null);

        // preencher o layout
        TextView tvNome = (TextView) v.findViewById(R.id.nomeProduto);
        tvNome.setText(produto.nome);

        TextView tvCodigo = (TextView) v.findViewById(R.id.codigoProduto);
        tvCodigo.setText(produto.codigo);

        TextView tvPreco = (TextView) v.findViewById(R.id.precoProduto);
        tvPreco.setText(String.valueOf(produto.preco));

        // retorna o layout preenchido
        return v;
    }

}
