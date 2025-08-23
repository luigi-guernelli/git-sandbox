package p02_cicli;

import java.util.Iterator;
public class CicliEsempio {
    public static void main(String[] args) {
        // Ciclo for
        System.out.println("Ciclo for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valore i = " + i);
        }

        // Ciclo while
        System.out.println("\nCiclo while:");
        int j = 1;
        while (j <= 3) {
            System.out.println("Valore j = " + j);
            j++;
        }

        // Ciclo do-while
        System.out.println("\nCiclo do-while:");
        int k = 1;
        do {
            System.out.println("Valore k = " + k);
            k++;
        } while (k <= 2);
    }
}
