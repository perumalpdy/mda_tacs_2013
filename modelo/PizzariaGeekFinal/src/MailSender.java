import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("038498de-a4ab-11e2-9d99-70f1a1bff932")
public class MailSender {
    @mdl.prop
    @objid ("b5d51cd5-a4ab-11e2-9d99-70f1a1bff932")
    private MailModel mailModel;

    @mdl.propsetter
    public void setMailModel(final MailModel value) {
        // Automatically generated method. Please do not modify this code.
        this.mailModel = value;
    }


    @objid ("bb6ced3c-a4ab-11e2-9d99-70f1a1bff932")
    public void enviarEmail(final Usuario usuario) {
    }

}
