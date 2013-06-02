package sp.senac.br.bean;

public class ItemDePedido {

    private Consumivel consumivel;

    public Consumivel getConsumivel() {
        return this.consumivel;
    }

    public void setConsumivel(final Consumivel value) {
        this.consumivel = value;
    }
    private int quantidade;

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final int value) {
        this.quantidade = value;
    }

    public double getTotal() {
        return 0;
    }
}