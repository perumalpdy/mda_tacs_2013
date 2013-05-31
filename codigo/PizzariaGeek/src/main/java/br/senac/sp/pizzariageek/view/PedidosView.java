package br.senac.sp.pizzariageek.view;

import br.senac.sp.pizzariageek.business.PedidosBusiness;
import br.senac.sp.pizzariageek.entities.Adicional;
import br.senac.sp.pizzariageek.entities.Cliente;
import br.senac.sp.pizzariageek.entities.Combo;
import br.senac.sp.pizzariageek.entities.Pedido;
import br.senac.sp.pizzariageek.entities.Pizza;
import br.senac.sp.pizzariageek.entities.Promocao;
import br.senac.sp.pizzariageek.utils.ReportBuilder;
import java.util.Date;
import java.util.List;

public class PedidosView {
    private PedidosBusiness pedidosBusiness;

    private PedidosBusiness getPedidosBusiness() {
        return this.pedidosBusiness;
    }

    private ReportBuilder reportBuilder;

    private ReportBuilder getReportBuilder() {
        return this.reportBuilder;
    }

    public Cliente procurarClientePorTelefone(final String telefone) {
        return pedidosBusiness.procurarClientePorTelefone(telefone);
    }

    public Cliente procurarClientePorEndereco(final String endereco) {
        return pedidosBusiness.procurarClientePorEndereco(endereco);
    }

    public boolean adicionarAdicional(final Adicional adicional) {
        pedidosBusiness.adicionarItem(adicional);
        return true;
    }

    public boolean adicionarPizza(final Pizza pizza) {
        pedidosBusiness.adicionarItem(pizza);
        return true;
    }

    public Pedido finalizarPedido() {
        return pedidosBusiness.finalizarPedido();
    }

    public boolean iniciarPedido() {
        pedidosBusiness.iniciarPedido();
        return true;
    }

    public void popularListaAdicionais() {
        pedidosBusiness.obterTodosAdicionais();
    }

    public void popularListaPizzas() {
        pedidosBusiness.obterTodasPizzas();
    }

    public List<Promocao> popularListaPromocoes() {
        return pedidosBusiness.obterTodasPromocoes();
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

}
