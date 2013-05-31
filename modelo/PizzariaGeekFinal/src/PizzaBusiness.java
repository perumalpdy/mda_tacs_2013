import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f6e3df23-a170-11e2-8c88-70f1a1bff932")
public class PizzaBusiness {
    @mdl.prop
    @objid ("df63ba42-a177-11e2-8c88-70f1a1bff932")
    private PizzaRepository pizzaRepository;

    @mdl.propsetter
    public void setPizzaRepository(final PizzaRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.pizzaRepository = value;
    }


    @objid ("13f6ec9f-a171-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Pizza pizza) {
    }

}
