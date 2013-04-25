import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a0371f2e-abbc-11e2-b492-70f1a1bff932")
public class EstoqueView {
    @mdl.prop
    @objid ("286901f3-abbd-11e2-b492-70f1a1bff932")
    private EstoqueBusiness estoqueBusiness;

    @mdl.propgetter
    private EstoqueBusiness getEstoqueBusiness() {
        // Automatically generated method. Please do not modify this code.
        return this.estoqueBusiness;
    }

    @mdl.prop
    @objid ("5bec413b-abbd-11e2-b492-70f1a1bff932")
    private ReportBuilder reportBuilder;

    @mdl.propgetter
    private ReportBuilder getReportBuilder() {
        // Automatically generated method. Please do not modify this code.
        return this.reportBuilder;
    }


    @objid ("6d19538d-abbd-11e2-b492-70f1a1bff932")
    public List<Byte> gerarRelatorioDeEstoque() {
        // TODO Auto-generated return
        return 0;
    }

}
