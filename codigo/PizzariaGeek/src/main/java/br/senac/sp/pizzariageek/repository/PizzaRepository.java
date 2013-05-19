package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Pizza;
import java.util.List;

public interface PizzaRepository {

    void save(final Pizza pizza);

    Pizza findById(final double id);

    List<Pizza> listAll();

    List<Pizza> pesquisarEstoque();

}
