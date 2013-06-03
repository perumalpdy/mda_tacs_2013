package sp.senac.br.pizzariageek.view;

import java.util.Date;
import java.util.List;
import sp.senac.br.pizzariageek.bean.Adicional;
import sp.senac.br.pizzariageek.bean.Cliente;
import sp.senac.br.pizzariageek.bean.Combo;
import sp.senac.br.pizzariageek.bean.Pedido;
import sp.senac.br.pizzariageek.bean.Pizza;
import sp.senac.br.pizzariageek.bean.Promocao;
import sp.senac.br.pizzariageek.business.PedidosBusiness;
import sp.senac.br.pizzariageek.util.ReportBuilder;

public class PedidosView {

    private PedidosBusiness pedidosBusiness;

    public void setPedidosBusiness(final PedidosBusiness value) {
        this.pedidosBusiness = value;
    }
    private ReportBuilder reportBuilder;

    public void setReportBuilder(final ReportBuilder value) {
        this.reportBuilder = value;
    }

    public Cliente procurarClientePorTelefone(final String telefone) {
        return pedidosBusiness.procurarClientePorTelefone(telefone);
    }

    public Cliente procurarClientePorEndereco(final String endereco) {
        return pedidosBusiness.procurarClientePorEndereco(endereco);
    }

    public void adicionarAdicional(final Adicional adicional) {
        pedidosBusiness.adicionarItem(adicional);
    }

    public void adicionarPizza(final Pizza pizza) {
        pedidosBusiness.adicionarItem(pizza);
    }

    public Pedido finalizarPedido() {
        return pedidosBusiness.finalizarPedido();
    }

    public void iniciarPedido() {
        pedidosBusiness.iniciarPedido();
    }

    public List<Adicional> popularListaAdicionais() {
        return pedidosBusiness.obterTodosAdicionais();
    }

    public List<Pizza> popularListaPizzas() {
        return pedidosBusiness.obterTodasPizzas();
    }

    public List<Promocao> popularListaPromocoes() {
        return null;
    }

    public List<Combo> popularListaCombo() {
        return pedidosBusiness.obterTodosCombos();
    }

    public void adicionarCombo(final Combo combo) {
        pedidosBusiness.adicionarItem(combo);
    }

    public byte procurarPorPeriodo(final Date dataInicio, final Date dataFinal, final String tipoRelatorio) {
        return 0;
    }
    
    public double calcularValorTotalPedido() {
        return pedidosBusiness.calcularTotal();
    }
}
