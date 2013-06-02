package sp.senac.br.bean;

public class Adicional implements Consumivel {

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
    private TipoAdicional tipoAdicional;

    public TipoAdicional getTipoAdicional() {
        return this.tipoAdicional;
    }

    public void setTipoAdicional(final TipoAdicional value) {
        this.tipoAdicional = value;
    }
    private int valorMinimoEstoque;

    public int getValorMinimoEstoque() {
        return this.valorMinimoEstoque;
    }

    public void setValorMinimoEstoque(final int value) {
        this.valorMinimoEstoque = value;
    }
}
