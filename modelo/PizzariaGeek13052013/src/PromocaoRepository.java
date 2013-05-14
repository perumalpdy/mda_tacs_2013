import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1461417b-a50e-11e2-89a9-70f1a1bff932")
public interface PromocaoRepository {

    @objid ("35d82ebb-a50e-11e2-89a9-70f1a1bff932")
    void save(final Promocao promocao);

    @objid ("e01cdfb8-a511-11e2-89a9-70f1a1bff932")
    Promocao findById(final long id);

}
