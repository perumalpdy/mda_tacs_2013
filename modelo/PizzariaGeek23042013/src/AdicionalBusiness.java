import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("88fbfc18-a17b-11e2-8c88-70f1a1bff932")
public class AdicionalBusiness {
    @mdl.prop
    @objid ("1ea63fbb-a17c-11e2-8c88-70f1a1bff932")
    private AdicionalRepository adicionalRepository;

    @mdl.propgetter
    public AdicionalRepository getAdicionalRepository() {
        // Automatically generated method. Please do not modify this code.
        return this.adicionalRepository;
    }


    @objid ("bc78d2a8-a17b-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Adicional adicional) {
    }

}
