package sp.senac.br.pizzariageek.view;

import sp.senac.br.pizzariageek.bean.Cliente;
import sp.senac.br.pizzariageek.bean.EnderecoECT;
import sp.senac.br.pizzariageek.business.ClienteBusiness;
import sp.senac.br.pizzariageek.business.ECTBusiness;

public class ClienteView {

    private ClienteBusiness clienteBusiness;

    public void setClienteBusiness(final ClienteBusiness value) {
        this.clienteBusiness = value;
    }
    private ECTBusiness eCTBusiness;

    public void setECTBusiness(final ECTBusiness value) {
        this.eCTBusiness = value;
    }

    public void cadastrar(final Cliente cliente) {
    }

    public EnderecoECT buscarCEP(final String cep) {
        return null;
    }
}
