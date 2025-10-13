package arraylist;

import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {

        // 1️ Creazione di un ArrayList di stringhe
        ArrayList<String> nomi = new ArrayList<>();

        // 2️ Aggiunta di elementi
        nomi.add("Mario");
        nomi.add("Luigi");
        nomi.add("Peach");

        // 3️ Accesso agli elementi
        System.out.println("=== STAMPA CON FOR CLASSICO ===");
        for (int i = 0; i < nomi.size(); i++) {
            System.out.println("Indice " + i + ": " + nomi.get(i));
        }

        // 4️ Stampa con for-each
        System.out.println("\n=== STAMPA CON FOR-EACH ===");
        for (String nome : nomi) {
            System.out.println("Nome: " + nome);
        }

        // 5️ Rimozione e verifica
        nomi.remove("Peach");
        System.out.println("\nDopo rimozione: " + nomi);

        // 6️ Ricerca di un elemento
        if (nomi.contains("Luigi")) {
            System.out.println("✅ Luigi è presente nella lista");
        }

        // 7️ Numero totale di elementi
        System.out.println("Totale nomi: " + nomi.size());
    }
}
