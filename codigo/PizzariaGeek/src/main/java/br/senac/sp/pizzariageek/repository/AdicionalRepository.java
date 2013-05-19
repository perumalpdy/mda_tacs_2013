package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Adicional;
import java.util.List;

public interface AdicionalRepository {

    void save(final Adicional adicional);

    Adicional findById(final long id);

    List<Adicional> listAll();

    List<Adicional> pesquisarEstoque();

}
