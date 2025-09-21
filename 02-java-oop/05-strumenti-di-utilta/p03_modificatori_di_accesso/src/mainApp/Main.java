package mainApp;

import azienda.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Dipendente("Luigi", 2500, "IT", 30);

        // accesso diretto
        System.out.println(d1.reparto);    // OK (public)
        // System.out.println(d1.nome);    // ERRORE (private)
        // System.out.println(d1.eta);     // ERRORE (default, package diverso)
        // System.out.println(d1.stipendio); // ERRORE (protected, package diverso senza estendere)

        // accesso tramite getter
        System.out.println(d1.getNome());  // OK
    }
}
