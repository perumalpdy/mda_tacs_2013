package br.senac.sp.pizzariageek.business;

import br.senac.sp.pizzariageek.entities.Adicional;
import br.senac.sp.pizzariageek.entities.Combo;
import br.senac.sp.pizzariageek.entities.Pizza;
import br.senac.sp.pizzariageek.entities.Promocao;
import br.senac.sp.pizzariageek.repository.AdicionalRepository;
import br.senac.sp.pizzariageek.repository.ComboRepository;
import br.senac.sp.pizzariageek.repository.PizzaRepository;
import br.senac.sp.pizzariageek.repository.PromocaoRepository;
import java.util.List;

public class PromocaoBusiness {
    private ComboRepository comboRepository;

    private ComboRepository getComboRepository() {
        return this.comboRepository;
    }

    private PromocaoRepository promocaoRepository;

    private PromocaoRepository getPromocaoRepository() {
        return this.promocaoRepository;
    }

    private PizzaRepository pizzaRepository;

    private PizzaRepository getPizzaRepository() {
        return this.pizzaRepository;
    }

    private AdicionalRepository adicionalRepository;

    private AdicionalRepository getAdicionalRepository() {
        return this.adicionalRepository;
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
