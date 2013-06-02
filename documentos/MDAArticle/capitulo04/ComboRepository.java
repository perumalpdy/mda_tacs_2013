import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("125fc4a6-a50e-11e2-89a9-70f1a1bff932")
public interface ComboRepository {

    @objid ("39770dee-a50e-11e2-89a9-70f1a1bff932")
    void save(final Combo combo);

    @objid ("53cd5170-cb3d-11e2-8eae-70f1a1bff932")
    List<Combo> listAll();

}
