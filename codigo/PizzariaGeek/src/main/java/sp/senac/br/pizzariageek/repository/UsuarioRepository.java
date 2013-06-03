package sp.senac.br.pizzariageek.repository;

import sp.senac.br.pizzariageek.bean.Usuario;

public interface UsuarioRepository {

    void save(final Usuario usuario);

    String findByApelido(final String apelido);

    Usuario findByNome(final String nome);
}
