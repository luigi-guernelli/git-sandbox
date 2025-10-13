package service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * CercaParola.java -> Classe per cercare parole all'interno dei file di testo
 */
public class CercaParola {

    /**
     * Conta quante volte una parola compare nel file.
     * @param file file di testo da analizzare
     * @param parolaCercata parola da contare (case-insensitive)
     * @return numero occorrenze trovate
     */
    public int contaParoleInFile(File file, String parolaCercata) {
        int conteggio = 0;
        String parolaDaCercare = parolaCercata.toLowerCase();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String riga;
            while ((riga = reader.readLine()) != null) {
                String[] parole = riga.toLowerCase().split("\\W+"); // split su spazi e punteggiatura
                for (String parola : parole) {
                    if (parola.equals(parolaDaCercare)) {
                        conteggio++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + file.getAbsolutePath());
        }

        return conteggio;
    }
}