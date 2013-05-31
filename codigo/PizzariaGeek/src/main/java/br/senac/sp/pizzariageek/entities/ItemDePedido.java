package br.senac.sp.pizzariageek.entities;

public class ItemDePedido {

    private Consumivel consumivel;
    public Double quantidade;

    public Double getTotal() {
        return consumivel.getPreco() * quantidade;
    }

    public Consumivel getConsumivel() {
        return this.consumivel;
    }

    public void setConsumivel(Consumivel consumivel) {
        this.consumivel = consumivel;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
