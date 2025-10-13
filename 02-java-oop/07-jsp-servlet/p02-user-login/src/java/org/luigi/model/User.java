package org.luigi.model;

/**
 * Classe modello per rappresentare un utente.
 * Contiene solo i dati essenziali: nome, email e password.
 */
public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    // Costruttore vuoto (necessario per le JSP e servlet)
    public User() {
    }

    // Costruttore completo
    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Costruttore senza ID (per registrazione)
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodo di utilità per il debug/log
    @Override
    public String toString() {
        return "User [username=" + username + ", email=" + email + "]";
    }
}
