package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Promocao;

public interface PromocaoRepository {

    void save(final Promocao promocao);

    Promocao findById(final long id);

}
