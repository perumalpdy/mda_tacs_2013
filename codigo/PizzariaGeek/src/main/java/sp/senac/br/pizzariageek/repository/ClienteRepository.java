package sp.senac.br.pizzariageek.repository;

import sp.senac.br.pizzariageek.bean.Cliente;

public interface ClienteRepository {

    void save(final Cliente cliente);

    Cliente findByTelefone(final String telefone);

    Cliente findByEndereco(final String endereco);
}
