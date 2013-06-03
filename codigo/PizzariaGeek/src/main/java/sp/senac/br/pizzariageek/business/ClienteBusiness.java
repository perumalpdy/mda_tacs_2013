package sp.senac.br.pizzariageek.business;

import sp.senac.br.pizzariageek.bean.Cliente;
import sp.senac.br.pizzariageek.repository.ClienteRepository;

public class ClienteBusiness {

    private ClienteRepository clienteRepository;

    public void setClienteRepository(final ClienteRepository value) {
        this.clienteRepository = value;
    }

    public void cadastrar(final Cliente cliente) {
    }
}
