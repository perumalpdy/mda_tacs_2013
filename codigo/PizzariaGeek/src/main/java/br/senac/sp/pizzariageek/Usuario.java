package br.senac.sp.pizzariageek;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fafdcd70-a4a6-11e2-9d99-70f1a1bff932")
public class Usuario {
    @objid ("04c351a1-a4a7-11e2-9d99-70f1a1bff932")
    private String email;

    @objid ("34b32391-a4a7-11e2-9d99-70f1a1bff932")
    public String nome;

    @objid ("3ad0528c-a4a7-11e2-9d99-70f1a1bff932")
    public String apelido;

    @objid ("3da4d9e8-a4a7-11e2-9d99-70f1a1bff932")
    public String senha;

    @objid ("55b4b80a-a4a7-11e2-9d99-70f1a1bff932")
    public boolean expirado;


    @objid ("dc8a99a0-ac70-11e2-9404-70f1a1bff932")
    public String getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("e388dd16-ac70-11e2-9404-70f1a1bff932")
    public void setEmail(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

}
