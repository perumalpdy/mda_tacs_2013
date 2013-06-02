package sp.senac.br.business;

import sp.senac.br.bean.Adicional;
import sp.senac.br.repository.AdicionalRepository;

public class AdicionalBusiness {

    private AdicionalRepository adicionalRepository;

    public void setAdicionalRepository(final AdicionalRepository value) {
        this.adicionalRepository = value;
    }

    public void cadastrar(final Adicional adicional) {
    }
}
