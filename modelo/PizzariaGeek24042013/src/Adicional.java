import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d19ff03-a17a-11e2-8c88-70f1a1bff932")
public class Adicional implements Consumivel {
    @objid ("8c4f7fb6-a17a-11e2-8c88-70f1a1bff932")
    public String nome;

    @objid ("91587b85-a17a-11e2-8c88-70f1a1bff932")
    public double preco;

    @objid ("4af8b083-a50d-11e2-89a9-70f1a1bff932")
    public TipoAdicional tipoAdicional;

    @objid ("952bcaa7-a512-11e2-89a9-70f1a1bff932")
    public int valorMinimoEstoque;


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
