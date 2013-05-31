import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d19ff03-a17a-11e2-8c88-70f1a1bff932")
public class Adicional implements Consumivel {
    @mdl.prop
    @objid ("8c4f7fb6-a17a-11e2-8c88-70f1a1bff932")
    private String nome;

    @mdl.propgetter
    public String getNome() {
        // Automatically generated method. Please do not modify this code.
        return this.nome;
    }

    @mdl.propsetter
    public void setNome(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.nome = value;
    }

    @mdl.prop
    @objid ("91587b85-a17a-11e2-8c88-70f1a1bff932")
    private double preco;

    @mdl.propgetter
    public double getPreco() {
        // Automatically generated method. Please do not modify this code.
        return this.preco;
    }

    @mdl.propsetter
    public void setPreco(final double value) {
        // Automatically generated method. Please do not modify this code.
        this.preco = value;
    }

    @mdl.prop
    @objid ("4af8b083-a50d-11e2-89a9-70f1a1bff932")
    private TipoAdicional tipoAdicional;

    @mdl.propgetter
    public TipoAdicional getTipoAdicional() {
        // Automatically generated method. Please do not modify this code.
        return this.tipoAdicional;
    }

    @mdl.propsetter
    public void setTipoAdicional(final TipoAdicional value) {
        // Automatically generated method. Please do not modify this code.
        this.tipoAdicional = value;
    }

    @mdl.prop
    @objid ("952bcaa7-a512-11e2-89a9-70f1a1bff932")
    private int valorMinimoEstoque;

    @mdl.propgetter
    public int getValorMinimoEstoque() {
        // Automatically generated method. Please do not modify this code.
        return this.valorMinimoEstoque;
    }

    @mdl.propsetter
    public void setValorMinimoEstoque(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.valorMinimoEstoque = value;
    }


    @objid ("428c8be1-a4ae-11e2-9d99-70f1a1bff932")
    public double getPreco() {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("bfe77176-a512-11e2-89a9-70f1a1bff932")
    public int getValorMinimoEstoque() {
        // TODO Auto-generated return
        return 0;
    }

}
