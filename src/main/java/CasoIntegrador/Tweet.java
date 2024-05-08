package CasoIntegrador;

import java.time.LocalDate;

public class Tweet {
    // Para el mensaje he usado el tipo String, ya que es una cadena de texto.
    protected String mensaje;
    // Para el autor he usado el tipo UserAccount, ya que es un objeto.
    protected UserAccount autor;
    protected LocalDate time;

    public Tweet(String mensaje, UserAccount autor) {
        // Compruebo que el mensaje no supere los 140 caracteres
        if (mensaje.length() > 140) {
            throw new IllegalArgumentException("El mensaje supera los 140 caracteres.");
        }
        this.mensaje = mensaje;
        this.autor = autor;
        this.time = LocalDate.now();
    }

    // Getters y setters
    public UserAccount getAutor() {
        return autor;
    }

    public void setAutor(UserAccount autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String message) {
        this.mensaje = message;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Tweet: " + mensaje + " (Enviado por: " + autor.getAlias() + " el " + time + ")";
    }
}
