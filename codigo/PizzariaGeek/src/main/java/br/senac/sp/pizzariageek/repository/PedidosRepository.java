package br.senac.sp.pizzariageek.repository;

import br.senac.sp.pizzariageek.entities.Pedido;
import java.util.Date;
import java.util.List;

public interface PedidosRepository {

    Pedido save(final Pedido Pedido);

    List<Pedido> queryDataPedidoBetween(final Date dataInicial, final Date dataFinal);

    boolean update(final Pedido pedido);

}
