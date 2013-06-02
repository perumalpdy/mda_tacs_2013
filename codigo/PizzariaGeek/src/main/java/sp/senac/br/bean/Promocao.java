package sp.senac.br.bean;

import java.util.Date;

public class Promocao {

    private TipoPromocao tipoPromocao;

    public TipoPromocao getTipoPromocao() {
        return this.tipoPromocao;
    }

    public void setTipoPromocao(final TipoPromocao value) {
        this.tipoPromocao = value;
    }
    private Date dataInicio;

    public Date getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(final Date value) {
        this.dataInicio = value;
    }
    private Date dataFinal;

    public Date getDataFinal() {
        return this.dataFinal;
    }

    public void setDataFinal(final Date value) {
        this.dataFinal = value;
    }
    private double valor;

    public double getValor() {
        return this.valor;
    }

    public void setValor(final double value) {
        this.valor = value;
    }
}
