import java.util.Scanner;

public class Contatore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ripeti azione\n");

        //Conta da 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Conteggio: " + i);
        }

        // Chiedi un numero finchè non è valido
        int numero;
        do {
            System.out.print("Inserisci un numero tra 1 e 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        scanner.close();
    }
}
