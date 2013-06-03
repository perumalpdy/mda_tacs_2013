package sp.senac.br.pizzariageek.repository;

import sp.senac.br.pizzariageek.bean.Promocao;

public interface PromocaoRepository {

    void save(final Promocao promocao);

    Promocao findById(final long id);
}
