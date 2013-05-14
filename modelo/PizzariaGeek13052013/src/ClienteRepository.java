import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d30923ea-a17e-11e2-8c88-70f1a1bff932")
public interface ClienteRepository {

    @objid ("6f4b7506-a2be-11e2-a49b-70f1a1bff932")
    void save(final Cliente cliente);

    @objid ("f60f86a1-a4ac-11e2-9d99-70f1a1bff932")
    Cliente findByTelefone(final String telefone);

    @objid ("339728c5-a4ad-11e2-9d99-70f1a1bff932")
    Cliente findByEndereco(final String endereco);

}
