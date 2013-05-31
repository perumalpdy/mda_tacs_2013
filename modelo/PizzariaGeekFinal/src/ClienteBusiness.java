import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6eb811e8-a17d-11e2-8c88-70f1a1bff932")
public class ClienteBusiness {
    @mdl.prop
    @objid ("198da11a-a2bf-11e2-a49b-70f1a1bff932")
    private ClienteRepository clienteRepository;

    @mdl.propsetter
    public void setClienteRepository(final ClienteRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.clienteRepository = value;
    }


    @objid ("e805a26a-a17d-11e2-8c88-70f1a1bff932")
    public void cadastrar(final Cliente cliente) {
    }

}
