import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60ccfa37-a4ae-11e2-9d99-70f1a1bff932")
public class PedidosBusiness {
    @mdl.prop
    @objid ("43e6753c-a4af-11e2-9d99-70f1a1bff932")
    private PedidosRepository pedidosRepository;

    @mdl.propsetter
    public void setPedidosRepository(final PedidosRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.pedidosRepository = value;
    }

    @mdl.prop
    @objid ("9794f6e7-a4b2-11e2-9d99-70f1a1bff932")
    private ClienteRepository clienteRepository;

    @mdl.propsetter
    public void setClienteRepository(final ClienteRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.clienteRepository = value;
    }

    @mdl.prop
    @objid ("e809d87d-a4b2-11e2-9d99-70f1a1bff932")
    private PizzaRepository pizzaRepository;

    @mdl.propsetter
    public void setPizzaRepository(final PizzaRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.pizzaRepository = value;
    }

    @mdl.prop
    @objid ("f74acb0b-a4b2-11e2-9d99-70f1a1bff932")
    private AdicionalRepository adicionalRepository;

    @mdl.propsetter
    public void setAdicionalRepository(final AdicionalRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.adicionalRepository = value;
    }

    @mdl.prop
    @objid ("7529d603-a511-11e2-89a9-70f1a1bff932")
    private PromocaoBusiness promocaoBusiness;

    @mdl.propsetter
    public void setPromocaoBusiness(final PromocaoBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.promocaoBusiness = value;
    }

    @mdl.prop
    @objid ("0ad02471-cb3e-11e2-8eae-70f1a1bff932")
    private ComboRepository comboRepository;

    @mdl.propsetter
    public void setComboRepository(final ComboRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.comboRepository = value;
    }

    @mdl.prop
    @objid ("704f8817-cb3e-11e2-8eae-70f1a1bff932")
    private Cliente cliente;

    @mdl.prop
    @objid ("73b04bf0-cb3e-11e2-8eae-70f1a1bff932")
    private ItemDePedido[] itensDePedido;


    @objid ("3d3959cf-a4b0-11e2-9d99-70f1a1bff932")
    public Cliente procurarClientePorTelefone(final String telefone) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("40746cac-a4b0-11e2-9d99-70f1a1bff932")
    public Cliente procurarClientePorEndereco(final String endereco) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("46343809-a4b0-11e2-9d99-70f1a1bff932")
    public void adicionarItem(final Consumivel item) {
    }

    @objid ("4b4c4f41-a4b0-11e2-9d99-70f1a1bff932")
    public double calcularTotal() {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("64c25251-a4b0-11e2-9d99-70f1a1bff932")
    public void iniciarPedido() {
    }

    @objid ("a4d4ee9e-a4b0-11e2-9d99-70f1a1bff932")
    public Pedido finalizarPedido() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("b73b631b-a4b2-11e2-9d99-70f1a1bff932")
    public List<Adicional> obterTodosAdicionais() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("b94ff307-a4b2-11e2-9d99-70f1a1bff932")
    public List<Pizza> obterTodasPizzas() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("79802105-a511-11e2-89a9-70f1a1bff932")
    public void aplicarPromocao(final long valor, final Promocao Promocao) {
    }

    @objid ("3fab0707-a512-11e2-89a9-70f1a1bff932")
    public List<Combo> obterTodosCombos() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("422fbf87-a512-11e2-89a9-70f1a1bff932")
    public List<Promocao> obterTodasPromocoes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("c4a57825-abb8-11e2-b492-70f1a1bff932")
    public List<Pedido> listaPedidosPorPeriodo(final Date dataInicial, final Date dataFinal) {
        // TODO Auto-generated return
        return null;
    }

}
