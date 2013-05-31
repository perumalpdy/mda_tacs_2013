import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fefb0984-a50d-11e2-89a9-70f1a1bff932")
public class PromocaoBusiness {
    @mdl.prop
    @objid ("8af371ea-a50f-11e2-89a9-70f1a1bff932")
    private ComboRepository comboRepository;

    @mdl.propsetter
    public void setComboRepository(final ComboRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.comboRepository = value;
    }

    @mdl.prop
    @objid ("8debd57c-a50f-11e2-89a9-70f1a1bff932")
    private PromocaoRepository promocaoRepository;

    @mdl.propsetter
    public void setPromocaoRepository(final PromocaoRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.promocaoRepository = value;
    }

    @mdl.prop
    @objid ("9075700f-a50f-11e2-89a9-70f1a1bff932")
    private PizzaRepository pizzaRepository;

    @mdl.propsetter
    public void setPizzaRepository(final PizzaRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.pizzaRepository = value;
    }

    @mdl.prop
    @objid ("96770053-a50f-11e2-89a9-70f1a1bff932")
    private AdicionalRepository adicionalRepository;

    @mdl.propsetter
    public void setAdicionalRepository(final AdicionalRepository value) {
        // Automatically generated method. Please do not modify this code.
        this.adicionalRepository = value;
    }


    @objid ("4cecb93f-a50e-11e2-89a9-70f1a1bff932")
    public void salvarCombo(final Combo combo) {
    }

    @objid ("4fceae4e-a50e-11e2-89a9-70f1a1bff932")
    public List<Adicional> obterTodosAdicionais() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("5ecd8dd3-a50e-11e2-89a9-70f1a1bff932")
    public List<Pizza> obterTodasPizzas() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("7c3217e1-a50e-11e2-89a9-70f1a1bff932")
    public void salvarPromocao(final List<Promocao> promocao) {
    }

    @objid ("62afabc6-a510-11e2-89a9-70f1a1bff932")
    public double calcularValorPromocao(final double valorPedido, final Promocao promocao) {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("b8448d8c-a511-11e2-89a9-70f1a1bff932")
    public List<Promocao> obterListaPromocoes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("cddc0f6c-a511-11e2-89a9-70f1a1bff932")
    public Promocao obterPromocao(final long id) {
        // TODO Auto-generated return
        return null;
    }

}
