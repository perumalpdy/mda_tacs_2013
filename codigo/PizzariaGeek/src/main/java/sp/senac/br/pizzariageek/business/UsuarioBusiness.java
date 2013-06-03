package sp.senac.br.pizzariageek.business;

import sp.senac.br.pizzariageek.bean.Usuario;
import sp.senac.br.pizzariageek.repository.UsuarioRepository;
import sp.senac.br.pizzariageek.util.MailSender;

public class UsuarioBusiness {

    private UsuarioRepository usuarioRepository;

    public void setUsuarioRepository(final UsuarioRepository value) {
        this.usuarioRepository = value;
    }

    private MailSender mailSender;

    public void setMailSender(final MailSender value) {
        this.mailSender = value;
    }

    public void cadastrar(final String Parameter) {
    }

    public String gerarSenha() {
        return null;
    }

    public void enviarEmailComSenha(final Usuario usuario) {
    }

    public void procurarUsuarioPorApelido(final String apelido) {
    }

    public void procurarUsuarioPorNome(final String nome) {
    }
}
