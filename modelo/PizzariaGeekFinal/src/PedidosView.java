import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a5c2c0ab-a4ad-11e2-9d99-70f1a1bff932")
public class PedidosView {
    @mdl.prop
    @objid ("41f7e46e-a4af-11e2-9d99-70f1a1bff932")
    private PedidosBusiness pedidosBusiness;

    @mdl.propsetter
    public void setPedidosBusiness(final PedidosBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.pedidosBusiness = value;
    }

    @mdl.prop
    @objid ("f0d12f18-abb8-11e2-b492-70f1a1bff932")
    private ReportBuilder reportBuilder;

    @mdl.propsetter
    public void setReportBuilder(final ReportBuilder value) {
        // Automatically generated method. Please do not modify this code.
        this.reportBuilder = value;
    }


    @objid ("4e4fdcf3-a4af-11e2-9d99-70f1a1bff932")
    public Cliente procurarClientePorTelefone(final String telefone) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("73cb2372-a4af-11e2-9d99-70f1a1bff932")
    public Cliente procurarClientePorEndereco(final String endereco) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("a64c3132-a4af-11e2-9d99-70f1a1bff932")
    public boolean adicionarAdicional(final Adicional adicional) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("af866349-a4af-11e2-9d99-70f1a1bff932")
    public boolean adicionarPizza(final Pizza pizza) {
        // TODO Auto-generated return
        return false;
    }

    @objid ("53018955-a4b0-11e2-9d99-70f1a1bff932")
    public void finalizarPedido() {
    }

    @objid ("9c2b3ed5-a4b0-11e2-9d99-70f1a1bff932")
    public void iniciarPedido() {
    }

    @objid ("9f507909-a4b1-11e2-9d99-70f1a1bff932")
    public void popularListaAdicionais() {
    }

    @objid ("adec9dad-a4b1-11e2-9d99-70f1a1bff932")
    public void popularListaPizzas() {
    }

    @objid ("d8dba53c-a510-11e2-89a9-70f1a1bff932")
    public List<Promocao> popularListaPromocoes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("1eb538f0-a511-11e2-89a9-70f1a1bff932")
    public List<Combo> popularListaCombo() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("46b007bc-a511-11e2-89a9-70f1a1bff932")
    public void adicionarCombo(final Combo combo) {
    }

    @objid ("cef39c12-abb6-11e2-b492-70f1a1bff932")
    public byte procurarPorPeriodo(final Date dataInicio, final Date dataFinal, final String tipoRelatorio) {
        // TODO Auto-generated return
        return 0;
    }

}
