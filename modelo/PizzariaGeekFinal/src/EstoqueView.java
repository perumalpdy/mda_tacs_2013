import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a0371f2e-abbc-11e2-b492-70f1a1bff932")
public class EstoqueView {
    @mdl.prop
    @objid ("286901f3-abbd-11e2-b492-70f1a1bff932")
    private EstoqueBusiness estoqueBusiness;

    @mdl.propsetter
    public void setEstoqueBusiness(final EstoqueBusiness value) {
        // Automatically generated method. Please do not modify this code.
        this.estoqueBusiness = value;
    }

    @mdl.prop
    @objid ("5bec413b-abbd-11e2-b492-70f1a1bff932")
    private ReportBuilder reportBuilder;

    @mdl.propsetter
    public void setReportBuilder(final ReportBuilder value) {
        // Automatically generated method. Please do not modify this code.
        this.reportBuilder = value;
    }


    @objid ("6d19538d-abbd-11e2-b492-70f1a1bff932")
    public List<Byte> gerarRelatorioDeEstoque() {
        // TODO Auto-generated return
        return 0;
    }

}
