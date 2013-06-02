package sp.senac.br.repository;

import sp.senac.br.bean.Cliente;

public interface ClienteRepository {

    void save(final Cliente cliente);

    Cliente findByTelefone(final String telefone);

    Cliente findByEndereco(final String endereco);
}
