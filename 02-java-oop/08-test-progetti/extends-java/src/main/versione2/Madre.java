package main.versione2;
import java.util.ArrayList;

public class Madre extends Persona {
    private ArrayList<Figlio> figli;

    public Madre(String nome, String cognome, String codiceFiscale, int annoNascita) {
        super(nome, cognome, codiceFiscale, annoNascita, "Femmina");
        figli = new ArrayList<>();
    }

    public void aggiungiFiglio(Figlio figlio) {
        figli.add(figlio);
    }

    public void stampaFigli() {
        if (figli.isEmpty()) {
            System.out.println(nome + " non ha figli.");
        } else {
            System.out.println(nome + " ha " + figli.size() + " figlio/i:");
            for (Figlio f : figli) {
                System.out.println("- " + f.getNome() + " (" + f.getSesso() + ")");
            }
        }
    }
}
