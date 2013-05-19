package br.senac.sp.pizzariageek.view;

import br.senac.sp.pizzariageek.business.PizzaBusiness;
import br.senac.sp.pizzariageek.entities.Pizza;

public class PizzaView {
    private PizzaBusiness pizzaBusiness;

    public void cadastrar(final Pizza pizza) {
        pizzaBusiness.cadastrar(pizza);
    }

}
