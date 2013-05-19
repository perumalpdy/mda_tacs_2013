package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Cliente;

public interface ClienteRepository {

    void save(final Cliente cliente);

    Cliente findByTelefone(final String telefone);

    Cliente findByEndereco(final String endereco);

}
