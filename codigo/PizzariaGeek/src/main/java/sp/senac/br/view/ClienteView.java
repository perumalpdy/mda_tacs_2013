package sp.senac.br.view;

import sp.senac.br.bean.Cliente;
import sp.senac.br.bean.EnderecoECT;
import sp.senac.br.business.ClienteBusiness;
import sp.senac.br.business.ECTBusiness;

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
