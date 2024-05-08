package CasoIntegrador;

public class Tweet {
    private String message;
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
