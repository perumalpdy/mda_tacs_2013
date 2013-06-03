package sp.senac.br.pizzariageek.repository;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Adicional;

public interface AdicionalRepository {

    void save(final Adicional adicional);

    Adicional findById(final long id);

    List<Adicional> listAll();

    List<Adicional> pesquisarEstoque();
}
