package CasoIntegrador;

public class Tweet {
    // Para el mensaje he usado el tipo String, ya que es una cadena de texto.
    private String message;
    // Para el autor he usado el tipo UserAccount, ya que es un objeto.
    private UserAccount autor;

    public Tweet(String message, UserAccount autor) {
        this.message = message;
        this.autor = autor;
    }

    public UserAccount getAutor() {
        return autor;
    }

    public void setAutor(UserAccount autor) {
        this.autor = autor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
