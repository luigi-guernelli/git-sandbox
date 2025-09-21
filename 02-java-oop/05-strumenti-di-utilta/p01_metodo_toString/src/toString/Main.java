package toString;

public class Main {
    public static void main(String[] args) {
    	
    	// Creo l'oggetto studente
        Studente s1 = new Studente("Luigi", 35);

        // Senza toString() → stampa "Studente@1a2b3c"
        // Con toString() → stampa in modo leggibile
        System.out.println(s1);
    }
}