import java.util.Scanner;

public class NumeriPari {
    // Esercizio: Stampa i primi 10 numeri pari.

    public static void main(String[] args) {
        System.out.println("Primi 10 numeri pari:");
        for (int i = 0; i < 10; i++) {
            System.out.println(2 * i); // 0, 2 , 4 ... 18
        }

        // Modifica: Chiedere i numeri all'utente.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci 10 numeri pari: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            //Verificare se il numero è pari
            if (numero % 2 !=0) {
                System.out.print("Errore: " + numero + " non è pari. Riprova.");
                i--; // Ripeti la stessa iterazione
            }
        }
        scanner.close();
    }
}
