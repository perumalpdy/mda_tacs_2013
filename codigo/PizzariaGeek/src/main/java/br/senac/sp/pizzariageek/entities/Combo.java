package br.senac.sp.pizzariageek.entities;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumivel {
    private List<Pizza> pizza = new ArrayList<Pizza> ();

    private List<Pizza> getPizza() {
        return this.pizza;
    }

    private List<Adicional> adicional = new ArrayList<Adicional> ();

    private List<Adicional> getAdicional() {
        return this.adicional;
    }


    public void getPreco() {
    }

    public int getValorMinimoEstoque() {
        return 0;
    }

}
