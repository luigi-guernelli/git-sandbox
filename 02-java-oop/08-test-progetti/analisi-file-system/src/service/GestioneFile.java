package service;

import model.RisultatiContatori;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * GestioneFile.java -> Classe per la gestione della persistenza dei risultati su file .txt e .csv
 */
public class GestioneFile {


    /**
     * Scrovo i risultati in un file .txt
     *
     * @param risultati    Oggetto con i costruttori
     * @param percorsoFile percorso dove salvare il file .txt
     */
    public void salvaRisultatiInTxt(RisultatiContatori risultati, String percorsoFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(percorsoFile))) {
            writer.write(risultati.toString());
            System.out.println("Risultati salvati in formato .txt con successo.");
        } catch (IOException e) {
            System.out.println("Errore nel salvataggio del file .txt " + e.getMessage());
        }
    }


    public void salvaRisultatiInCsv(RisultatiContatori risultati, String percorsoFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(percorsoFile))) {
            writer.write("NumeroCartelle, NumeroSottoCartelle, NumeroFile, NumeroParoleTrovate\n");
            writer.write(risultati.getNumeroCartelle() + "," +
                             risultati.getNumeroSottoCartelle() + "," +
                             risultati.getNumeroFile() + "," +
                             risultati.getNumeroParoleTrovate() + "\n");
            System.out.printf("Risultati salvati in formato .csv con successo");
        } catch (IOException e) {
            System.err.println("Errore nel salvataggio del file .csv: " + e.getMessage());
        }
    }
}
