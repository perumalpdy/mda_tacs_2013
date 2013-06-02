package sp.senac.br.business;

import sp.senac.br.bean.Cliente;
import sp.senac.br.repository.ClienteRepository;

public class ClienteBusiness {

    private ClienteRepository clienteRepository;

    public void setClienteRepository(final ClienteRepository value) {
        this.clienteRepository = value;
    }

    public void cadastrar(final Cliente cliente) {
    }
}
