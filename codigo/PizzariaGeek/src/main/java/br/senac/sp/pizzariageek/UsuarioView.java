import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("99863f20-a4a7-11e2-9d99-70f1a1bff932")
public class UsuarioView {
    @mdl.prop
    @objid ("525fc80b-a4aa-11e2-9d99-70f1a1bff932")
    private UsuarioBusiness usuarioBusiness;

    @mdl.propgetter
    private UsuarioBusiness getUsuarioBusiness() {
        // Automatically generated method. Please do not modify this code.
        return this.usuarioBusiness;
    }


    @objid ("4b552ebc-a4a9-11e2-9d99-70f1a1bff932")
    public void cadastrar() {
    }

}
