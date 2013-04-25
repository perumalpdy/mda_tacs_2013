import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f9597b5e-a50c-11e2-89a9-70f1a1bff932")
public class Combo implements Consumivel {
    @mdl.prop
    @objid ("1d6240b1-a50d-11e2-89a9-70f1a1bff932")
    private List<Pizza> pizza = new ArrayList<Pizza> ();

    @mdl.propgetter
    private List<Pizza> getPizza() {
        // Automatically generated method. Please do not modify this code.
        return this.pizza;
    }

    @mdl.prop
    @objid ("2312a284-a50d-11e2-89a9-70f1a1bff932")
    private List<Adicional> adicional = new ArrayList<Adicional> ();

    @mdl.propgetter
    private List<Adicional> getAdicional() {
        // Automatically generated method. Please do not modify this code.
        return this.adicional;
    }


    @objid ("0e24f7b1-a50d-11e2-89a9-70f1a1bff932")
    public void getPreco() {
    }

    @objid ("bfe74a65-a512-11e2-89a9-70f1a1bff932")
    public int getValorMinimoEstoque() {
        // TODO Auto-generated return
        return 0;
    }

}
