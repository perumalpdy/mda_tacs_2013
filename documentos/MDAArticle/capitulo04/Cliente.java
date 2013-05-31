import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("881737a8-a17c-11e2-8c88-70f1a1bff932")
public class Cliente {
    @mdl.prop
    @objid ("971b6e72-a17c-11e2-8c88-70f1a1bff932")
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
    @objid ("99ae09d7-a17c-11e2-8c88-70f1a1bff932")
    private String telefone;

    @mdl.propgetter
    private String getTelefone() {
        // Automatically generated method. Please do not modify this code.
        return this.telefone;
    }

    @mdl.propsetter
    private void setTelefone(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.telefone = value;
    }

    @mdl.prop
    @objid ("c71c0981-a17c-11e2-8c88-70f1a1bff932")
    private String endereco;

    @mdl.propgetter
    public String getEndereco() {
        // Automatically generated method. Please do not modify this code.
        return this.endereco;
    }

    @mdl.propsetter
    public void setEndereco(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.endereco = value;
    }

    @mdl.prop
    @objid ("d138afa9-a17c-11e2-8c88-70f1a1bff932")
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
    @objid ("e89eddcf-a17c-11e2-8c88-70f1a1bff932")
    private String referencia;

    @mdl.propgetter
    public String getReferencia() {
        // Automatically generated method. Please do not modify this code.
        return this.referencia;
    }

    @mdl.propsetter
    public void setReferencia(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.referencia = value;
    }


}
