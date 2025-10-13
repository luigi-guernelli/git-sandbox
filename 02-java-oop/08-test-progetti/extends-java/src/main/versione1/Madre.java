package main.versione1;

public class Madre extends Persona {

    public Madre(String nome, String cognome, String codiceFiscale, int eta) {
        super(nome, cognome, codiceFiscale, eta, "Femmina");
    }

    public void curaFiglio() {
        System.out.println(nome + " si prende cura del figlio.");
    }
}
