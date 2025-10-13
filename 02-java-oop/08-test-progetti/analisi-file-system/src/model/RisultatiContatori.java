package model;

import java.io.Serializable;

/**
 * Java-Doc
 * RisultatiContatori.java -> Classe che rappresenta i contatori per file cartelle sotto-cartelle
 * e parole trovate nei file durante l'analisi del filesystem.
 */
public class RisultatiContatori {

    private static final long serialVersionUID = 1L;

    // Attributi
    private int numeroCartelle;
    private int numeroSottoCartelle;
    private int numeroFile;
    private int numeroParoleTrovate;

    // Costruttore vuoto
    public RisultatiContatori() {
        this.numeroCartelle = 0;
        this.numeroSottoCartelle = 0;
        this.numeroFile = 0;
        this.numeroParoleTrovate = 0;
    }

    // Costruttore completo
    public RisultatiContatori(int numeroCartelle, int numeroSottoCartelle,
                              int numeroFile, int numeroParoleTrovate) {
        this.numeroCartelle = numeroCartelle;
        this.numeroSottoCartelle = numeroSottoCartelle;
        this.numeroFile = numeroFile;
        this.numeroParoleTrovate = numeroParoleTrovate;
    }

    public int getNumeroCartelle() {
        return numeroCartelle;
    }

    public void setNumeroCartelle(int numeroCartelle) {
        this.numeroCartelle = numeroCartelle;
    }

    public int getNumeroSottoCartelle() {
        return numeroSottoCartelle;
    }

    public void setNumeroSottoCartelle(int numeroSottoCartelle) {
        this.numeroSottoCartelle = numeroSottoCartelle;
    }

    public int getNumeroFile() {
        return numeroFile;
    }

    public void setNumeroFile(int numeroFile) {
        this.numeroFile = numeroFile;
    }

    public int getNumeroParoleTrovate() {
        return numeroParoleTrovate;
    }

    public void setNumeroParoleTrovate(int numeroParoleTrovate) {
        this.numeroParoleTrovate = numeroParoleTrovate;
    }

    // Metodo toString per rappresentazione leggibile

    @Override
    public String toString() {
        return "RisultatiContatori{" +
                "numeroCartelle=" + numeroCartelle +
                ", numeroSottoCartelle=" + numeroSottoCartelle +
                ", numeroFile=" + numeroFile +
                ", numeroParoleTrovate=" + numeroParoleTrovate +
                '}';
    }
}
