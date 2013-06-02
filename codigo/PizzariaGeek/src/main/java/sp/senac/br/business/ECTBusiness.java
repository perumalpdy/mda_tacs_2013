package sp.senac.br.business;

import sp.senac.br.bean.EnderecoECT;
import sp.senac.br.util.ECTService;

public class ECTBusiness {

    private ECTService eCTService;

    public void setECTService(final ECTService value) {
        this.eCTService = value;
    }

    public EnderecoECT buscarEndereco(final String cep) {
        return null;
    }

    public boolean validarCEP(final String cep) {
        return false;
    }
}
