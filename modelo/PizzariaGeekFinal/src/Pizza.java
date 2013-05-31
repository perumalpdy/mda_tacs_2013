import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("df007d62-a179-11e2-8c88-70f1a1bff932")
@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
public @interface Pizza  implements Consumivel {
    @objid ("e814b05b-a179-11e2-8c88-70f1a1bff932")
    String nome();

    @objid ("eaa63a4b-a179-11e2-8c88-70f1a1bff932")
    double preco();


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
