import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a980a835-a50e-11e2-89a9-70f1a1bff932")
public class Promocao {
    @mdl.prop
    @objid ("d64063f2-a50e-11e2-89a9-70f1a1bff932")
    private TipoPromocao tipoPromocao;

    @mdl.propgetter
    public TipoPromocao getTipoPromocao() {
        // Automatically generated method. Please do not modify this code.
        return this.tipoPromocao;
    }

    @mdl.propsetter
    public void setTipoPromocao(final TipoPromocao value) {
        // Automatically generated method. Please do not modify this code.
        this.tipoPromocao = value;
    }

    @mdl.prop
    @objid ("e1b943d3-a50e-11e2-89a9-70f1a1bff932")
    private Date dataInicio;

    @mdl.propgetter
    public Date getDataInicio() {
        // Automatically generated method. Please do not modify this code.
        return this.dataInicio;
    }

    @mdl.propsetter
    public void setDataInicio(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.dataInicio = value;
    }

    @mdl.prop
    @objid ("e42df688-a50e-11e2-89a9-70f1a1bff932")
    private Date dataFinal;

    @mdl.propgetter
    public Date getDataFinal() {
        // Automatically generated method. Please do not modify this code.
        return this.dataFinal;
    }

    @mdl.propsetter
    public void setDataFinal(final Date value) {
        // Automatically generated method. Please do not modify this code.
        this.dataFinal = value;
    }

    @mdl.prop
    @objid ("fa7e8521-a510-11e2-89a9-70f1a1bff932")
    private double valor;

    @mdl.propgetter
    public double getValor() {
        // Automatically generated method. Please do not modify this code.
        return this.valor;
    }

    @mdl.propsetter
    public void setValor(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.valor = value;
    }


}
