package br.com.g4it.aula0601;

/**
 * Created by gvieceli on 21/09/15.
 */
public class Produto {

    public String nome;
    public String codigo;
    public String preco;

    public Produto(String codigo, String nome, String preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
