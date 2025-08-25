package getter_setter_v01;

/** Incapsulamento
 * Classe Studente che utilizza getter e setter per incapsulare i dati.
 */

/**
 * Esempio con Getter e Setter
 */
public class Studente {

    //  Metodo main
    public static void main(String[] args) {
        
    	// Creazione oggetto Studente
        Studente s1 = new Studente("Mario Rossi", 20);

        // Uso dei getter
        System.out.println("Nome: " + s1.getNome());
        System.out.println("Età: " + s1.getEta());

        // Uso del setter
        s1.setEta(25);
        System.out.println("Nuova età aggiornata: " + s1.getEta());

        // Prova di validazione con setter
        s1.setEta(-5);  // Non dovrebbe essere accettato
    }

    // Attributi privati
    private String nome;
    private int eta;

    // Costruttore
    public Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter per nome
    public String getNome() {
        return nome;
    }

    // Setter per nome
    public void setNome(String nuovoNome) {
        nome = nuovoNome;
    }

    // Getter per età
    public int getEta() {
        return eta;
    }

    // Setter per età con controllo
    public void setEta(int nuovaEta) {
        if (nuovaEta > 0) {
            eta = nuovaEta;
        } else {
            System.out.println("⚠️ Età non valida, deve essere positiva.");
        }
    }
}

