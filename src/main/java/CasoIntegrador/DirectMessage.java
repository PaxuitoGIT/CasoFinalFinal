package CasoIntegrador;

public class DirectMessage extends Tweet {
    private UserAccount receptor;

    public DirectMessage(String mensaje, UserAccount autor, UserAccount receptor) {
        super(mensaje, autor);
        this.receptor = receptor;
    }

    public UserAccount getReceptor() {
        return receptor;
    }

    public void setReceptor(UserAccount receptor) {
        this.receptor = receptor;
    }
}
