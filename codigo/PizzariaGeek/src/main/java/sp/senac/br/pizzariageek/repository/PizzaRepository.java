package sp.senac.br.pizzariageek.repository;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Pizza;

public interface PizzaRepository {

    void save(final Pizza pizza);

    Pizza findById(final double id);

    List<Pizza> listAll();

    List<Pizza> pesquisarEstoque();
}
