package br.senac.sp.pizzariageek.business;

import br.senac.sp.pizzariageek.entities.Pizza;
import br.senac.sp.pizzariageek.repository.PizzaRepository;

public class PizzaBusiness {
    private PizzaRepository pizzaRepository;

    private PizzaRepository getPizzaRepository() {
        return this.pizzaRepository;
    }

    public void cadastrar(final Pizza pizza) {
        pizzaRepository.save(pizza);
    }

}
