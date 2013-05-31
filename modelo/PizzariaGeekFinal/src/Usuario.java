import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fafdcd70-a4a6-11e2-9d99-70f1a1bff932")
public class Usuario {
    @mdl.prop
    @objid ("04c351a1-a4a7-11e2-9d99-70f1a1bff932")
    private String email;

    @mdl.propgetter
    public String getEmail() {
        // Automatically generated method. Please do not modify this code.
        return this.email;
    }

    @mdl.propsetter
    public void setEmail(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.email = value;
    }

    @mdl.prop
    @objid ("34b32391-a4a7-11e2-9d99-70f1a1bff932")
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
    @objid ("3ad0528c-a4a7-11e2-9d99-70f1a1bff932")
    private String apelido;

    @mdl.propgetter
    public String getApelido() {
        // Automatically generated method. Please do not modify this code.
        return this.apelido;
    }

    @mdl.propsetter
    public void setApelido(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.apelido = value;
    }

    @mdl.prop
    @objid ("3da4d9e8-a4a7-11e2-9d99-70f1a1bff932")
    private String senha;

    @mdl.propgetter
    public String getSenha() {
        // Automatically generated method. Please do not modify this code.
        return this.senha;
    }

    @mdl.propsetter
    public void setSenha(final String value) {
        // Automatically generated method. Please do not modify this code.
        this.senha = value;
    }

    @mdl.prop
    @objid ("55b4b80a-a4a7-11e2-9d99-70f1a1bff932")
    private boolean expirado;

    @mdl.propgetter
    public boolean isExpirado() {
        // Automatically generated method. Please do not modify this code.
        return this.expirado;
    }

    @mdl.propsetter
    public void setExpirado(final boolean value) {
        // Automatically generated method. Please do not modify this code.
        this.expirado = value;
    }


}
