package sp.senac.br.pizzariageek.business;

import sp.senac.br.pizzariageek.bean.Adicional;
import sp.senac.br.pizzariageek.repository.AdicionalRepository;

public class AdicionalBusiness {

    private AdicionalRepository adicionalRepository;

    public void setAdicionalRepository(final AdicionalRepository value) {
        this.adicionalRepository = value;
    }

    public void cadastrar(final Adicional adicional) {
    }
}
