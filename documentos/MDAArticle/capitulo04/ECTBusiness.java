import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("efd17214-a17d-11e2-8c88-70f1a1bff932")
public class ECTBusiness {
    @mdl.prop
    @objid ("1c26f358-a2bf-11e2-a49b-70f1a1bff932")
    private ECTService eCTService;

    @mdl.propsetter
    public void setECTService(final ECTService value) {
        // Automatically generated method. Please do not modify this code.
        this.eCTService = value;
    }


    @objid ("f9b3f491-a17d-11e2-8c88-70f1a1bff932")
    public EnderecoECT buscarEndereco(final String cep) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("bce0ab86-a2be-11e2-a49b-70f1a1bff932")
    public boolean validarCEP(final String cep) {
        // TODO Auto-generated return
        return false;
    }

}
