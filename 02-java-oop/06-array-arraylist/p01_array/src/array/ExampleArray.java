package array;

public class ExampleArray {
    public static void main(String[] args) {

        // 1️ Dichiarazione e creazione di un array di interi con 5 posizioni
        int[] numeri = new int[5];

        // 2️ Assegnazione di valori agli indici (gli indici partono da 0)
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        numeri[3] = 40;
        numeri[4] = 50;

        // 3️ Stampa con ciclo for classico
        System.out.println("=== STAMPA CON FOR CLASSICO ===");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Indice " + i + ": " + numeri[i]);
        }

        // 4️ Stampa con ciclo for-each
        System.out.println("\n=== STAMPA CON FOR-EACH ===");
        for (int numero : numeri) {
            System.out.println("Numero: " + numero);
        }
    }
}

