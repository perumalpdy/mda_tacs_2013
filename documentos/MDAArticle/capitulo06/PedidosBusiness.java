package sp.senac.br.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sp.senac.br.bean.Adicional;
import sp.senac.br.bean.Cliente;
import sp.senac.br.bean.Combo;
import sp.senac.br.bean.Consumivel;
import sp.senac.br.bean.ItemDePedido;
import sp.senac.br.bean.Pedido;
import sp.senac.br.bean.Pizza;
import sp.senac.br.bean.Promocao;
import sp.senac.br.repository.AdicionalRepository;
import sp.senac.br.repository.ClienteRepository;
import sp.senac.br.repository.ComboRepository;
import sp.senac.br.repository.PedidosRepository;
import sp.senac.br.repository.PizzaRepository;

public class PedidosBusiness {
    private List<ItemDePedido> itensDePedido;
    private Cliente cliente;
    private static final Integer ONE = new Integer(1);

    private PedidosRepository pedidosRepository;

    public void setPedidosRepository(final PedidosRepository value) {
        this.pedidosRepository = value;
    }
    
    private ComboRepository comboRepository;

    public void setComboRepository(final ComboRepository value) {
        this.comboRepository = value;
    }
    
    private ClienteRepository clienteRepository;

    public void setClienteRepository(final ClienteRepository value) {
        this.clienteRepository = value;
    }

    private PizzaRepository pizzaRepository;

    public void setPizzaRepository(final PizzaRepository value) {
        this.pizzaRepository = value;
    }

    private AdicionalRepository adicionalRepository;

    public void setAdicionalRepository(final AdicionalRepository value) {
        this.adicionalRepository = value;
    }

    private PromocaoBusiness promocaoBusiness;

    public void setPromocaoBusiness(final PromocaoBusiness value) {
        this.promocaoBusiness = value;
    }

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
        itemDePedido.setQuantidade(ONE);
        
        itensDePedido.add(itemDePedido);
    }

    public double calcularTotal() {
        double total = 0;
        
        for(ItemDePedido itemDePedido : itensDePedido) {
            total += itemDePedido.getConsumivel().getPreco() * itemDePedido.getQuantidade();
        }
        
        return total;
    }

    public void iniciarPedido() {
        itensDePedido = new ArrayList<ItemDePedido>();
    }

    public Pedido finalizarPedido() {
        Pedido pedido = new Pedido();
        
        pedido.setItemDePedido(itensDePedido);
        pedido.setCliente(cliente);
        
        pedidosRepository.save(pedido);
        
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
        return null;
    }

    public List<Pedido> listaPedidosPorPeriodo(final Date dataInicial, final Date dataFinal) {
        return null;
    }
}
