package sp.senac.br.pizzariageek.bean;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumivel {

    private List<Pizza> pizza = new ArrayList<Pizza>();

    public List<Pizza> getPizza() {
        return this.pizza;
    }

    public void setPizza(final List<Pizza> value) {
        this.pizza = value;
    }
    private List<Adicional> adicional = new ArrayList<Adicional>();

    public List<Adicional> getAdicional() {
        return this.adicional;
    }

    public void setAdicional(final List<Adicional> value) {
        this.adicional = value;
    }

    public double getPreco() {
        return 0;
    }

    public int getValorMinimoEstoque() {
        return 0;
    }
}
