import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("725ca05a-a4ae-11e2-9d99-70f1a1bff932")
public interface PedidosRepository {

    @objid ("7d5b1e50-a4ae-11e2-9d99-70f1a1bff932")
    Pedido save(final String Parameter);

    @objid ("7a8b1d90-abb8-11e2-b492-70f1a1bff932")
    List<Pedido> queryDataPedidoBetween(final Date dataInicial, final Date dataFinal);

    @objid ("080bb8ba-abb9-11e2-b492-70f1a1bff932")
    boolean update(final Pedido pedido);

}
