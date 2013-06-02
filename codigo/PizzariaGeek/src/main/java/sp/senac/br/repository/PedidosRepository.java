package sp.senac.br.repository;

import java.util.Date;
import java.util.List;
import sp.senac.br.bean.Pedido;

public interface PedidosRepository {

    Pedido save(final Pedido pedido);

    List<Pedido> queryDataPedidoBetween(final Date dataInicial, final Date dataFinal);

    boolean update(final Pedido pedido);
}
