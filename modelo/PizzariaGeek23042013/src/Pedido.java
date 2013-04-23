import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e137a144-a4ae-11e2-9d99-70f1a1bff932")
public class Pedido {
    @mdl.prop
    @objid ("f0c97420-a4ae-11e2-9d99-70f1a1bff932")
    private List<Consumivel> consumivel = new ArrayList<Consumivel> ();

    @mdl.propgetter
    public List<Consumivel> getConsumivel() {
        // Automatically generated method. Please do not modify this code.
        return this.consumivel;
    }

    @mdl.prop
    @objid ("10d6e106-a4af-11e2-9d99-70f1a1bff932")
    private Cliente cliente;

    @mdl.propgetter
    public Cliente getCliente() {
        // Automatically generated method. Please do not modify this code.
        return this.cliente;
    }


}
