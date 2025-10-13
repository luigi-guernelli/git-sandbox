package main.versione1;

public class Padre extends Persona {

    public Padre(String nome, String cognome, String codiceFiscale, int eta) {
        super(nome, cognome, codiceFiscale, eta, "Maschio");
    }

    public void lavora() {
        System.out.println(nome + " sta lavorando per la famiglia.");
    }
}
