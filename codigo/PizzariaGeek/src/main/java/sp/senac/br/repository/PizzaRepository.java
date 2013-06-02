package sp.senac.br.repository;

import java.util.List;
import sp.senac.br.bean.Pizza;

public interface PizzaRepository {

    void save(final Pizza pizza);

    Pizza findById(final double id);

    List<Pizza> listAll();

    List<Pizza> pesquisarEstoque();
}
