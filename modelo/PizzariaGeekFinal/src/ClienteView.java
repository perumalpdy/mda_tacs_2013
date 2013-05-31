import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("16e7893d-a17d-11e2-8c88-70f1a1bff932")
public class ClienteView {
    @mdl.prop
    @objid ("11a96715-a2bf-11e2-a49b-70f1a1bff932")
    private ClienteBusiness clienteBusiness;

    @mdl.propsetter
    public void setClienteBusiness(final ClienteBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.clienteBusiness = value;
    }

    @mdl.prop
    @objid ("16d7026e-a2bf-11e2-a49b-70f1a1bff932")
    private ECTBusiness eCTBusiness;

    @mdl.propsetter
    public void setECTBusiness(final ECTBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.eCTBusiness = value;
    }


    @objid ("325062eb-a17d-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Cliente cliente) {
    }

    @objid ("56df2314-a17d-11e2-8c88-70f1a1bff932")
    public EnderecoECT buscarCEP(final String cep) {
        // TODO Auto-generated return
        return null;
    }

}
