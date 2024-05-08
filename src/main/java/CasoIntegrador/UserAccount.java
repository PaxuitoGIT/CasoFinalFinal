package CasoIntegrador;

import java.util.ArrayList;

public class UserAccount {
    // Para el alias y el email he usado el tipo String, ya que son cadenas de texto.
    private String alias;
    private String email;
    // Para los tweets, seguidores y seguidos he usado el tipo ArrayList, ya que son colecciones de objetos.
    private ArrayList<Tweet> tweets;
    private ArrayList<UserAccount> seguidores;
    private ArrayList<UserAccount> seguidos;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido.");
        }
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido.");
        }

        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguidos = new ArrayList<>();
    }

    // Getters y setters
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    public ArrayList<UserAccount> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<UserAccount> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<UserAccount> getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(ArrayList<UserAccount> seguidos) {
        this.seguidos = seguidos;
    }
}
