import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("90321181-a170-11e2-8c88-70f1a1bff932")
public class PizzaView {
    @mdl.prop
    @objid ("8bf9f797-a177-11e2-8c88-70f1a1bff932")
    private PizzaBusiness pizzaBusiness;

    @mdl.propsetter
    public void setPizzaBusiness(final PizzaBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.pizzaBusiness = value;
    }


    @objid ("a4d2fac4-a170-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Pizza pizza) {
    }

}
