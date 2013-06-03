package sp.senac.br.pizzariageek.view;

import java.util.List;
import sp.senac.br.pizzariageek.bean.Adicional;
import sp.senac.br.pizzariageek.bean.Combo;
import sp.senac.br.pizzariageek.bean.Promocao;
import sp.senac.br.pizzariageek.business.PromocaoBusiness;

public class PromocaoView {

    private PromocaoBusiness promocaoBusiness;

    public void setPromocaoBusiness(final PromocaoBusiness value) {
        this.promocaoBusiness = value;
    }

    public void salvarCombo(final Combo combo) {
    }

    public List<Adicional> popularComboAdicionais() {
        return null;
    }

    public void popularComboPizzas() {
    }

    public void salvarPromocao(final Promocao promocao) {
    }
}
