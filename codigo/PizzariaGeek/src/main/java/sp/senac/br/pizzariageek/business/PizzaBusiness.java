package sp.senac.br.pizzariageek.business;

import sp.senac.br.pizzariageek.bean.Pizza;
import sp.senac.br.pizzariageek.repository.PizzaRepository;

public class PizzaBusiness {

    private PizzaRepository pizzaRepository;

    public void setPizzaRepository(final PizzaRepository value) {
        this.pizzaRepository = value;
    }

    public void cadastrar(final Pizza pizza) {
    }
}
