import java.util.ArrayList;
import java.util.Scanner;

public class NomiOrdineInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNomi = new ArrayList<>();

        // Chiedi tre nomi all'utente
        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci il nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            listaNomi.add(nome);
        }

        //Stampa i nomi in ordine inverso
        System.out.println("Nomi in ordine inverso:");
        for (int i = listaNomi.size() - 1; i >=0; i--) {
            System.out.println(listaNomi.get(i));
        }
        scanner.close();
    }
}
