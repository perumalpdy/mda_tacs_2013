import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cce3c7d4-abbc-11e2-b492-70f1a1bff932")
public class EstoqueBusiness {
    @mdl.prop
    @objid ("37f5cbad-abbd-11e2-b492-70f1a1bff932")
    private AdicionalRepository adicionalRepository;

    @mdl.propgetter
    private AdicionalRepository getAdicionalRepository() {
        // Automatically generated method. Please do not modify this code.
        return this.adicionalRepository;
    }

    @mdl.prop
    @objid ("bda6786e-abbd-11e2-b492-70f1a1bff932")
    private PizzaRepository pizzaRepository;

    @mdl.propgetter
    private PizzaRepository getPizzaRepository() {
        // Automatically generated method. Please do not modify this code.
        return this.pizzaRepository;
    }


    @objid ("8586954d-abbd-11e2-b492-70f1a1bff932")
    public List<Consumivel> pesquisarEstoqueAdicionais() {
        // TODO Auto-generated return
        return null;
    }

}
