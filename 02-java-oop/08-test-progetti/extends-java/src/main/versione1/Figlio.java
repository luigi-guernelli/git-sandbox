package main.versione1;

public class Figlio extends Persona {

    public Figlio(String nome, String cognome, String codiceFiscale, int eta, String sesso) {
        super(nome, cognome, codiceFiscale, eta, sesso);
    }

    public void gioca() {
        System.out.println(nome + " sta giocando.");
    }
}
