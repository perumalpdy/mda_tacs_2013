import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c92fae5e-a176-11e2-8c88-70f1a1bff932")
public interface PizzaRepository {

    @objid ("fb047408-a176-11e2-8c88-70f1a1bff932")
    void save(final Pizza pizza);

    @objid ("25966980-a4b1-11e2-9d99-70f1a1bff932")
    Pizza findById(final double id);

    @objid ("2c2e2176-a4b1-11e2-9d99-70f1a1bff932")
    List<Pizza> listAll();

    @objid ("a716892b-abbd-11e2-b492-70f1a1bff932")
    List<Pizza> pesquisarEstoque();

}
