package br.senac.sp.pizzariageek.entities;

public class Adicional implements Consumivel {
    public String nome;

    public double preco;

    public TipoAdicional tipoAdicional;

    public int valorMinimoEstoque;

    public int getValorMinimoEstoque() {
        return 0;
    }

    public void getPreco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
