import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e1e4726a-a4b1-11e2-9d99-70f1a1bff932")
public class ItemDePedido {
    @objid ("3beddc69-a4b2-11e2-9d99-70f1a1bff932")
    private Consumivel consumivel;

    @objid ("4e4318fb-a4b3-11e2-9d99-70f1a1bff932")
    public String quantidade;


    @objid ("47a12e15-a4b2-11e2-9d99-70f1a1bff932")
    public void getTotal() {
    }

    @objid ("a76232e1-abbe-11e2-b492-70f1a1bff932")
    public Consumivel getConsumivel() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.consumivel;
    }

}
