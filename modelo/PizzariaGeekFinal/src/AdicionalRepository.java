import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("de5b548b-a17b-11e2-8c88-70f1a1bff932")
public interface AdicionalRepository {

    @objid ("0ccdcfb6-a17c-11e2-8c88-70f1a1bff932")
    void save(final Adicional adicional);

    @objid ("3ee9a1ce-a4b1-11e2-9d99-70f1a1bff932")
    Adicional findById(final long id);

    @objid ("8be0e84f-a4b1-11e2-9d99-70f1a1bff932")
    List<Adicional> listAll();

    @objid ("f8e512c7-abbc-11e2-b492-70f1a1bff932")
    List<Adicional> pesquisarEstoque();

}
