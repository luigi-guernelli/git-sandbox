package service;

import model.RisultatiContatori;

import java.io.File;

/**
 * CercaPath.java -> Classe di servizio per esplorare un percorso e aggiornare i contatori
 * relativi a cartelle, sotto-cartelle e file.
 */
public class CercaPath {

    /**
     * Verifica se il percorso esiste ed è una directory valida.
     *
     * @param percorso Path assoluto da controllare.
     * @return true se esiste ed è una directory, false altrimenti.
     */
    public boolean verificaPercorsoValido(String percorso) {
        File directory = new File(percorso);
        return directory.exists() && directory.isDirectory();
    }

    /**
     * Analizza ricorsivamente il percorso fornito aggiornando i contatori.
     *
     * @param percorso  Path di partenza
     * @param risultati Oggetto RisultatiContatori da aggiornare.
     */
    public void analizzaPercorso(String percorso, RisultatiContatori risultati) {
        File directory = new File(percorso);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Percorso non valido: " + percorso);
            return;
        }

        risultati.setNumeroCartelle(1); // conta la cartella principale una sola volta

        esploraDirectory(directory, risultati);
    }

    private void esploraDirectory(File directory, RisultatiContatori risultati) {
        File[] elementi = directory.listFiles();

        if (elementi != null) {
            for (File file : elementi) {
                if (file.isDirectory()) {
                    risultati.setNumeroSottoCartelle(risultati.getNumeroSottoCartelle() + 1);
                    esploraDirectory(file, risultati); // ricorsione
                } else if (file.isFile()) {
                    risultati.setNumeroFile(risultati.getNumeroFile() + 1);
                }
            }
        }
    }
}