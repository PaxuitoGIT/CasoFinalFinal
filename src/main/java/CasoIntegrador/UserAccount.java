package CasoIntegrador;

import java.util.ArrayList;

public class UserAccount {
    private String alias;
    private String email;
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
}
