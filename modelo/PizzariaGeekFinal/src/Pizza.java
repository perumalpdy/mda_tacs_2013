import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("df007d62-a179-11e2-8c88-70f1a1bff932")
public class Pizza implements Consumivel {
    @mdl.prop
    @objid ("e814b05b-a179-11e2-8c88-70f1a1bff932")
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
    @objid ("eaa63a4b-a179-11e2-8c88-70f1a1bff932")
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


    @objid ("db4f34e9-c8d4-11e2-be7c-70f1a1bff932")
    public double getPreco() {
        // TODO Auto-generated return
        return 0;
    }

    @objid ("db4f5bfa-c8d4-11e2-be7c-70f1a1bff932")
    public int getValorMinimoEstoque() {
        // TODO Auto-generated return
        return 0;
    }

}
