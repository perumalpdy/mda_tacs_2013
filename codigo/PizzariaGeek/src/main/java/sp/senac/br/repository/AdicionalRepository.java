package sp.senac.br.repository;

import java.util.List;
import sp.senac.br.bean.Adicional;

public interface AdicionalRepository {

    void save(final Adicional adicional);

    Adicional findById(final long id);

    List<Adicional> listAll();

    List<Adicional> pesquisarEstoque();
}
