package sp.senac.br.business;

import sp.senac.br.bean.Pizza;
import sp.senac.br.repository.PizzaRepository;

public class PizzaBusiness {

    private PizzaRepository pizzaRepository;

    public void setPizzaRepository(final PizzaRepository value) {
        this.pizzaRepository = value;
    }

    public void cadastrar(final Pizza pizza) {
    }
}
