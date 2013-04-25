import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ac07c2df-a4a7-11e2-9d99-70f1a1bff932")
public interface UsuarioRepository {

    @objid ("9e840a6a-a4a9-11e2-9d99-70f1a1bff932")
    void save(final Usuario usuario);

    @objid ("222cf8af-a4aa-11e2-9d99-70f1a1bff932")
    String findByApelido(final String apelido);

    @objid ("28e9c561-a4aa-11e2-9d99-70f1a1bff932")
    Usuario findByNome(final String nome);

}
