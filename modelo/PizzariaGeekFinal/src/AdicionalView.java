import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("617aab39-a17a-11e2-8c88-70f1a1bff932")
public class AdicionalView {
    @mdl.prop
    @objid ("9d3ee57b-a17b-11e2-8c88-70f1a1bff932")
    private AdicionalBusiness adicionalBusiness;

    @mdl.propsetter
    public void setAdicionalBusiness(final AdicionalBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.adicionalBusiness = value;
    }


    @objid ("6ea3644c-a17a-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Adicional adicional) {
    }

}
