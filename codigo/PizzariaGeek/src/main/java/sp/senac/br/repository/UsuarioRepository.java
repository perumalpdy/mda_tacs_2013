package sp.senac.br.repository;

import sp.senac.br.bean.Usuario;

public interface UsuarioRepository {

    void save(final Usuario usuario);

    String findByApelido(final String apelido);

    Usuario findByNome(final String nome);
}
