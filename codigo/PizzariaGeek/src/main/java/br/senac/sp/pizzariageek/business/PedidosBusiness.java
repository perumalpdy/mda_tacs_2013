package br.senac.sp.pizzariageek.business;

import br.senac.sp.pizzariageek.entities.Adicional;
import br.senac.sp.pizzariageek.entities.Cliente;
import br.senac.sp.pizzariageek.entities.Combo;
import br.senac.sp.pizzariageek.entities.Consumivel;
import br.senac.sp.pizzariageek.entities.ItemDePedido;
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
    private Cliente cliente;
    private Pedido pedido;
    private List<ItemDePedido> itens;
    private double valorTotal = new Double(0);
    
    private static final Double QUANTIDADE_UM = new Double(1);

    public Cliente procurarClientePorTelefone(final String telefone) {
        cliente = clienteRepository.findByTelefone(telefone);
        return cliente;
    }

    public Cliente procurarClientePorEndereco(final String endereco) {
        cliente = clienteRepository.findByEndereco(endereco);
        return cliente;
    }

    public void adicionarItem(final Consumivel item) {
        ItemDePedido itemDePedido = new ItemDePedido();
        
        itemDePedido.setConsumivel(item);
        itemDePedido.setQuantidade(QUANTIDADE_UM);
        
        itens.add(itemDePedido);
    }

    public double calcularTotal() {
        for(ItemDePedido item : itens) {
            valorTotal += item.getTotal();
        }
        
        return valorTotal;
    }

    public void iniciarPedido() {
        itens = new ArrayList<ItemDePedido>();
    }

    public Pedido finalizarPedido() {
        Pedido pedido = new Pedido();
        
        pedido.setCliente(cliente);
        pedido.setItems(itens);
        pedido.setValorTotal(calcularTotal());
        
        return pedido;
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
