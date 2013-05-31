import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e1e4726a-a4b1-11e2-9d99-70f1a1bff932")
public class ItemDePedido {
    @mdl.prop
    @objid ("3beddc69-a4b2-11e2-9d99-70f1a1bff932")
    private Consumivel consumivel;

    @mdl.propgetter
    public Consumivel getConsumivel() {
        // Automatically generated method. Please do not modify this code.
        return this.consumivel;
    }

    @mdl.propsetter
    public void setConsumivel(final Consumivel value) {
        // Automatically generated method. Please do not modify this code.
        this.consumivel = value;
    }

    @mdl.prop
    @objid ("4e4318fb-a4b3-11e2-9d99-70f1a1bff932")
    private int quantidade;

    @mdl.propgetter
    public int getQuantidade() {
        // Automatically generated method. Please do not modify this code.
        return this.quantidade;
    }

    @mdl.propsetter
    public void setQuantidade(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.quantidade = value;
    }


    @objid ("47a12e15-a4b2-11e2-9d99-70f1a1bff932")
    public double getTotal() {
        // TODO Auto-generated return
        return 0;
    }

}
