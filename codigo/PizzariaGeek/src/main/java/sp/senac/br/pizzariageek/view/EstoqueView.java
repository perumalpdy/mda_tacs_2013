package sp.senac.br.pizzariageek.view;

import java.util.List;
import sp.senac.br.pizzariageek.business.EstoqueBusiness;
import sp.senac.br.pizzariageek.util.ReportBuilder;

public class EstoqueView {

    private EstoqueBusiness estoqueBusiness;

    public void setEstoqueBusiness(final EstoqueBusiness value) {
        this.estoqueBusiness = value;
    }
    private ReportBuilder reportBuilder;

    public void setReportBuilder(final ReportBuilder value) {
        this.reportBuilder = value;
    }

    public List<Byte> gerarRelatorioDeEstoque() {
        return null;
    }
}
