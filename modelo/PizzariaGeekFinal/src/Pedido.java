import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e137a144-a4ae-11e2-9d99-70f1a1bff932")
public class Pedido {
    @mdl.prop
    @objid ("10d6e106-a4af-11e2-9d99-70f1a1bff932")
    private Cliente cliente;

    @mdl.propsetter
    public void setCliente(final Cliente value) {
        // Automatically generated method. Please do not modify this code.
        this.cliente = value;
    }

    @mdl.prop
    @objid ("4e6a5704-a4b2-11e2-9d99-70f1a1bff932")
    private List<ItemDePedido> itemDePedido = new ArrayList<ItemDePedido> ();

    @mdl.propgetter
    public List<ItemDePedido> getItemDePedido() {
        // Automatically generated method. Please do not modify this code.
        return this.itemDePedido;
    }

    @mdl.propsetter
    public void setItemDePedido(final List<ItemDePedido> value) {
        // Automatically generated method. Please do not modify this code.
        this.itemDePedido = value;
    }


}
