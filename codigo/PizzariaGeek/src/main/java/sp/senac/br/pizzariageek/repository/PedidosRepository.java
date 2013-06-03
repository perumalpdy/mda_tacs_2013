package sp.senac.br.pizzariageek.repository;

import java.util.Date;
import java.util.List;
import sp.senac.br.pizzariageek.bean.Pedido;

public interface PedidosRepository {

    Pedido save(final Pedido pedido);

    List<Pedido> queryDataPedidoBetween(final Date dataInicial, final Date dataFinal);

    boolean update(final Pedido pedido);
}
