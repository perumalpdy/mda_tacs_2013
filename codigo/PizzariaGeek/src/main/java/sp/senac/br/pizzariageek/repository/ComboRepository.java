package sp.senac.br.pizzariageek.repository;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Combo;

public interface ComboRepository {

    void save(final Combo combo);

    public List<Combo> listAll();
}
