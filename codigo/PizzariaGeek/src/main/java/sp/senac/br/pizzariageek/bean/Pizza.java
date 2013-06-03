package sp.senac.br.pizzariageek.bean;

public class Pizza implements Consumivel {

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String value) {
        this.nome = value;
    }
    private double preco;

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(final double value) {
        this.preco = value;
    }

    public int getValorMinimoEstoque() {
        return 0;
    }
}