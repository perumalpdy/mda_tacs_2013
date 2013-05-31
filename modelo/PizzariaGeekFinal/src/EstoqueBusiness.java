import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cce3c7d4-abbc-11e2-b492-70f1a1bff932")
public class EstoqueBusiness {
    @mdl.prop
    @objid ("37f5cbad-abbd-11e2-b492-70f1a1bff932")
    private AdicionalRepository adicionalRepository;

    @mdl.propsetter
    public void setAdicionalRepository(final AdicionalRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.adicionalRepository = value;
    }

    @mdl.prop
    @objid ("bda6786e-abbd-11e2-b492-70f1a1bff932")
    private PizzaRepository pizzaRepository;

    @mdl.propsetter
    public void setPizzaRepository(final PizzaRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.pizzaRepository = value;
    }


    @objid ("8586954d-abbd-11e2-b492-70f1a1bff932")
    public List<Consumivel> pesquisarEstoqueAdicionais() {
        // TODO Auto-generated return
        return null;
    }

}
