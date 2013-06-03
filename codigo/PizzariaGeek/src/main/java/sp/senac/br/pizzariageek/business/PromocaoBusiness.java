package sp.senac.br.pizzariageek.business;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Adicional;
import sp.senac.br.pizzariageek.bean.Combo;
import sp.senac.br.pizzariageek.bean.Pizza;
import sp.senac.br.pizzariageek.bean.Promocao;
import sp.senac.br.pizzariageek.repository.AdicionalRepository;
import sp.senac.br.pizzariageek.repository.ComboRepository;
import sp.senac.br.pizzariageek.repository.PizzaRepository;
import sp.senac.br.pizzariageek.repository.PromocaoRepository;

public class PromocaoBusiness {

    private ComboRepository comboRepository;

    public void setComboRepository(final ComboRepository value) {
        this.comboRepository = value;
    }
    
    private PromocaoRepository promocaoRepository;

    public void setPromocaoRepository(final PromocaoRepository value) {
        this.promocaoRepository = value;
    }

    private PizzaRepository pizzaRepository;

    public void setPizzaRepository(final PizzaRepository value) {
        this.pizzaRepository = value;
    }

    private AdicionalRepository adicionalRepository;

    public void setAdicionalRepository(final AdicionalRepository value) {
        this.adicionalRepository = value;
    }

    public void salvarCombo(final Combo combo) {
    }

    public List<Adicional> obterTodosAdicionais() {
        return null;
    }

    public List<Pizza> obterTodasPizzas() {
        return null;
    }

    public void salvarPromocao(final List<Promocao> promocao) {
    }

    public double calcularValorPromocao(final double valorPedido, final Promocao promocao) {
        return 0;
    }

    public List<Promocao> obterListaPromocoes() {
        return null;
    }

    public Promocao obterPromocao(final long id) {
        return null;
    }
}
