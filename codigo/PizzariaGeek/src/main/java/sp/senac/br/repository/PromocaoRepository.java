package sp.senac.br.repository;

import sp.senac.br.bean.Promocao;

public interface PromocaoRepository {

    void save(final Promocao promocao);

    Promocao findById(final long id);
}
