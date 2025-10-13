package main;

import model.RisultatiContatori;
import service.CercaFile;
import service.CercaParola;
import service.CercaPath;
import service.GestioneFile;

import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 * AnalisiFileSystem.java v.1.0
 * Programma console per esplorazione e analisi dei file
 */
public class AnalisiFileSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inizializzazione classi di servizio
        CercaPath cercaPath = new CercaPath();
        CercaFile cercaFile = new CercaFile();
        CercaParola cercaParola = new CercaParola();
        GestioneFile gestioneFile = new GestioneFile();
        RisultatiContatori risultati = new RisultatiContatori();

        // INPUT: percorso da analizzare
        System.out.print("Inserisci il percorso della cartella da analizzare: ");
        String percorso = scanner.nextLine();

        // Validazione percorso
        if (!cercaPath.verificaPercorsoValido(percorso)) {
            System.out.println("Percorso non valido.");
            return;
        }

        // INPUT: parola da cercare
        System.out.print("Inserisci la parola da cercare nei file di testo: ");
        String parola = scanner.nextLine();

        // Analisi struttura cartelle e file
        cercaPath.analizzaPercorso(percorso, risultati);

        // Cerca tutti i file di testo (.txt)
        List<File> filesTxt = cercaFile.cercaFile(percorso, ".txt");

        for (File file : filesTxt) {
            int occorrenze = cercaParola.contaParoleInFile(file, parola);
            risultati.setNumeroParoleTrovate(risultati.getNumeroParoleTrovate() + occorrenze);
        }

        // Mostra risultati su console
        System.out.println("\n--- RISULTATI COMPLETI ---");
        System.out.println(risultati);

        // Persistenza
        gestioneFile.salvaRisultatiInTxt(risultati, "risultati.txt");
        gestioneFile.salvaRisultatiInCsv(risultati, "risultati.csv");

        System.out.println("\nOperazione completata. Risultati salvati.");
    }
}
