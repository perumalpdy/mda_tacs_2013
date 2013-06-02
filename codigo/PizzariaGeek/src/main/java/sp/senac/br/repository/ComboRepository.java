package sp.senac.br.repository;

import java.util.List;
import sp.senac.br.bean.Combo;

public interface ComboRepository {

    void save(final Combo combo);

    public List<Combo> listAll();
}
