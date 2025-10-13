package service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * CercaFile.java -> Classe che gestisce la ricerca di file all'interno di una directory,
 * con supporto a nome parziale, nome esatto o estensione.
 */
public class CercaFile {

    /**
     * Cerca file per nome o estensione ricorsivamente in una directory.
     *
     * @param directoryPath percorso di partenza
     * @param criterio      criterio di ricerca (parola chiave o estensione es.".txt")
     * @return lista di file trovati
     */
    public List<File> cercaFile(String directoryPath, String criterio) {
        List<File> risultati = new ArrayList<>();
        File cartella = new File(directoryPath);

        if (cartella.exists() && cartella.isDirectory()) {
            cercaRicorsiva(cartella, criterio.toLowerCase(), risultati);
        }
        return risultati;
    }

    /**
     * Metodo ricorsivo per esplorare tutte le sottocartelle.
     */
    private void cercaRicorsiva(File cartella, String criterio, List<File> risultati) {
        File[] elementi = cartella.listFiles();

        if (elementi != null) {
            for (File file : elementi) {
                if (file.isDirectory()) {
                    cercaRicorsiva(file, criterio, risultati);
                } else {
                    String nomeFile = file.getName().toLowerCase();
                    if (nomeFile.contains(criterio) || nomeFile.endsWith(criterio)) {
                        risultati.add(file);
                    }
                }
            }
        }
    }

}
