package sp.senac.br.pizzariageek.business;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Consumivel;
import sp.senac.br.pizzariageek.repository.AdicionalRepository;
import sp.senac.br.pizzariageek.repository.PizzaRepository;

public class EstoqueBusiness {

    private AdicionalRepository adicionalRepository;

    public void setAdicionalRepository(final AdicionalRepository value) {
        this.adicionalRepository = value;
    }
    
    private PizzaRepository pizzaRepository;

    public void setPizzaRepository(final PizzaRepository value) {
        this.pizzaRepository = value;
    }

    public List<Consumivel> pesquisarEstoqueAdicionais() {
        return null;
    }
}
