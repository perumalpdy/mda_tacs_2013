import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7aa1687e-a17d-11e2-8c88-70f1a1bff932")
public class EnderecoECT {
    @mdl.prop
    @objid ("85853220-a17d-11e2-8c88-70f1a1bff932")
    private String cep;

    @mdl.propgetter
    public String getCep() {
        // Automatically generated method. Please do not modify this code.
        return this.cep;
    }

    @mdl.propsetter
    public void setCep(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.cep = value;
    }

    @mdl.prop
    @objid ("8d9f49ff-a17d-11e2-8c88-70f1a1bff932")
    private String logradouro;

    @mdl.propgetter
    public String getLogradouro() {
        // Automatically generated method. Please do not modify this code.
        return this.logradouro;
    }

    @mdl.propsetter
    public void setLogradouro(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.logradouro = value;
    }

    @mdl.prop
    @objid ("9828963d-a17d-11e2-8c88-70f1a1bff932")
    private String numero;

    @mdl.propgetter
    public String getNumero() {
        // Automatically generated method. Please do not modify this code.
        return this.numero;
    }

    @mdl.propsetter
    public void setNumero(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.numero = value;
    }

    @mdl.prop
    @objid ("a2ae870f-a17d-11e2-8c88-70f1a1bff932")
    private String complemento;

    @mdl.propgetter
    public String getComplemento() {
        // Automatically generated method. Please do not modify this code.
        return this.complemento;
    }

    @mdl.propsetter
    public void setComplemento(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.complemento = value;
    }

    @mdl.prop
    @objid ("aa81f7f5-a17d-11e2-8c88-70f1a1bff932")
    private String bairro;

    @mdl.propgetter
    public String getBairro() {
        // Automatically generated method. Please do not modify this code.
        return this.bairro;
    }

    @mdl.propsetter
    public void setBairro(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.bairro = value;
    }


}
