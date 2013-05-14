import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9aa65958-a4a7-11e2-9d99-70f1a1bff932")
public class UsuarioBusiness {
    @mdl.prop
    @objid ("55d72179-a4aa-11e2-9d99-70f1a1bff932")
    private UsuarioRepository usuarioRepository;

    @mdl.propgetter
    private UsuarioRepository getUsuarioRepository() {
        // Automatically generated method. Please do not modify this code.
        return this.usuarioRepository;
    }

    @mdl.prop
    @objid ("b2d713de-a4ab-11e2-9d99-70f1a1bff932")
    private MailSender mailSender;

    @mdl.propgetter
    private MailSender getMailSender() {
        // Automatically generated method. Please do not modify this code.
        return this.mailSender;
    }


    @objid ("8fb69bde-a4a9-11e2-9d99-70f1a1bff932")
    public void cadastrar(final String Parameter) {
    }

    @objid ("b48684ab-a4a9-11e2-9d99-70f1a1bff932")
    public String gerarSenha() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("c64b1e45-a4a9-11e2-9d99-70f1a1bff932")
    public void enviarEmailComSenha(final Usuario usuario) {
    }

    @objid ("ddda7fe5-a4a9-11e2-9d99-70f1a1bff932")
    public void procurarUsuarioPorApelido(final String apelido) {
    }

    @objid ("fa9951a5-a4a9-11e2-9d99-70f1a1bff932")
    public void procurarUsuarioPorNome(final String nome) {
    }

}
