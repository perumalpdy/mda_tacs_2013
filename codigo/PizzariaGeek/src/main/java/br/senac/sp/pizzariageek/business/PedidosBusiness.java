package br.senac.sp.pizzariageek.business;

import br.senac.sp.pizzariageek.entities.Adicional;
import br.senac.sp.pizzariageek.entities.Cliente;
import br.senac.sp.pizzariageek.entities.Combo;
import br.senac.sp.pizzariageek.entities.Consumivel;
import br.senac.sp.pizzariageek.entities.Pedido;
import br.senac.sp.pizzariageek.entities.Pizza;
import br.senac.sp.pizzariageek.entities.Promocao;
import br.senac.sp.pizzariageek.repository.AdicionalRepository;
import br.senac.sp.pizzariageek.repository.ClienteRepository;
import br.senac.sp.pizzariageek.repository.ComboRepository;
import br.senac.sp.pizzariageek.repository.PedidosRepository;
import br.senac.sp.pizzariageek.repository.PizzaRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidosBusiness {
    private PedidosRepository pedidosRepository;
    private ClienteRepository clienteRepository;
    private PizzaRepository pizzaRepository;
    private AdicionalRepository adicionalRepository;
    private ComboRepository comboRepository;
    private PromocaoBusiness promocaoBusiness;
    private List<Pedido> pedidos;

    public Cliente procurarClientePorTelefone(final String telefone) {
        return clienteRepository.findByTelefone(telefone);
    }

    public Cliente procurarClientePorEndereco(final String endereco) {
        return clienteRepository.findByEndereco(endereco);
    }

    public void adicionarItem(final Consumivel item) {
    }

    public double calcularTotal() {
        return 0;
    }

    public void iniciarPedido() {
        pedidos = new ArrayList<Pedido>();
    }

    public Pedido finalizarPedido(final String Pedido) {
        return null;
    }

    public List<Adicional> obterTodosAdicionais() {
        return adicionalRepository.listAll();
    }

    public List<Pizza> obterTodasPizzas() {
        return pizzaRepository.listAll();
    }

    public void aplicarPromocao(final long valor, final Promocao Promocao) {
    }

    public List<Combo> obterTodosCombos() {
        return comboRepository.listAll();
    }

    public List<Promocao> obterTodasPromocoes() {
        return promocaoBusiness.obterListaPromocoes();
    }

    public List<Pedido> listaPedidosPorPeriodo(final Date dataInicial, final Date dataFinal) {
        return null;
    }

}
