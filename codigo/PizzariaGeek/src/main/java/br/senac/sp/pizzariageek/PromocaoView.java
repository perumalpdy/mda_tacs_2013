import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e3f1b65c-a50d-11e2-89a9-70f1a1bff932")
public class PromocaoView {
    @mdl.prop
    @objid ("af928600-a50f-11e2-89a9-70f1a1bff932")
    private PromocaoBusiness promocaoBusiness;

    @mdl.propgetter
    private PromocaoBusiness getPromocaoBusiness() {
        // Automatically generated method. Please do not modify this code.
        return this.promocaoBusiness;
    }


    @objid ("47dbf522-a50e-11e2-89a9-70f1a1bff932")
    public void salvarCombo(final Combo combo) {
    }

    @objid ("4983def7-a50e-11e2-89a9-70f1a1bff932")
    public List<Adicional> popularComboAdicionais() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("5b98e3af-a50e-11e2-89a9-70f1a1bff932")
    public void popularComboPizzas() {
    }

    @objid ("7a17e28f-a50e-11e2-89a9-70f1a1bff932")
    public void salvarPromocao(final Promocao promocao) {
    }

}
