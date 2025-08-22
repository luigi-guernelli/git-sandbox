// Importo le classi dai package
import p05_scuola.Studente;
import p05_biblioteca.Libro;


// Classe principale
public class Main {
    public static void main(String[] args) {
    	
    	// Creo l'oggetto studente
        Studente s1 = new Studente("Luigi", 20);
        
     // Creo l'oggetto libro
        Libro l1 = new Libro("Il Signore degli Anelli", "Tolkien");

        s1.presentaStudente();
        l1.descriviLibro();
    }
}
