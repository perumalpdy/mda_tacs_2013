import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("038498de-a4ab-11e2-9d99-70f1a1bff932")
public class MailSender {
    @mdl.prop
    @objid ("b5d51cd5-a4ab-11e2-9d99-70f1a1bff932")
    private MailModel mailModel;

    @mdl.propgetter
    public MailModel getMailModel() {
        // Automatically generated method. Please do not modify this code.
        return this.mailModel;
    }


    @objid ("bb6ced3c-a4ab-11e2-9d99-70f1a1bff932")
    public void enviarEmail(final Usuario usuario) {
    }

}
