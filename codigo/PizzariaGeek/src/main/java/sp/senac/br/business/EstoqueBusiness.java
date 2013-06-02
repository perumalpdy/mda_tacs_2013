package sp.senac.br.business;

import java.util.List;
import sp.senac.br.bean.Consumivel;
import sp.senac.br.repository.AdicionalRepository;
import sp.senac.br.repository.PizzaRepository;

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
