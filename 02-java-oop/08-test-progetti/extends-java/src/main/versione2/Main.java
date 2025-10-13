package main.versione2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Padre padre = null;
        Madre madre = null;
        boolean esci = false;

        while (!esci) {
            System.out.println("\n--- MENU FAMIGLIA ---");
            System.out.println("1. Inserisci madre");
            System.out.println("2. Inserisci padre");
            System.out.println("3. Aggiungi figlio");
            System.out.println("4. Mostra dati nucleo familiare");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            switch (scelta) {
                case 1:
                    System.out.print("Nome madre: ");
                    String nomeMadre = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognomeMadre = scanner.nextLine();
                    System.out.print("Codice Fiscale: ");
                    String cfMadre = scanner.nextLine();
                    System.out.print("Anno di nascita: ");
                    int annoMadre = scanner.nextInt();
                    madre = new Madre(nomeMadre, cognomeMadre, cfMadre, annoMadre);
                    break;

                case 2:
                    System.out.print("Nome padre: ");
                    String nomePadre = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognomePadre = scanner.nextLine();
                    System.out.print("Codice Fiscale: ");
                    String cfPadre = scanner.nextLine();
                    System.out.print("Anno di nascita: ");
                    int annoPadre = scanner.nextInt();
                    padre = new Padre(nomePadre, cognomePadre, cfPadre, annoPadre);
                    break;

                case 3:
                    if (padre == null && madre == null) {
                        System.out.println("Prima inserisci almeno uno dei genitori!");
                        break;
                    }

                    System.out.print("Nome figlio: ");
                    String nomeFiglio = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognomeFiglio = scanner.nextLine();
                    System.out.print("Codice Fiscale: ");
                    String cfFiglio = scanner.nextLine();
                    System.out.print("Anno di nascita: ");
                    int annoFiglio = scanner.nextInt();
                    scanner.nextLine(); // pulizia buffer
                    System.out.print("Sesso (Maschio/Femmina): ");
                    String sessoFiglio = scanner.nextLine();

                    Figlio nuovoFiglio = new Figlio(nomeFiglio, cognomeFiglio, cfFiglio, annoFiglio, sessoFiglio);

                    if (padre != null) padre.aggiungiFiglio(nuovoFiglio);
                    if (madre != null) madre.aggiungiFiglio(nuovoFiglio);
                    break;

                case 4:
                    int totale = 0;
                    if (padre != null) {
                        padre.stampaInformazioni();
                        padre.stampaFigli();
                        totale++;
                    }
                    if (madre != null) {
                        madre.stampaInformazioni();
                        madre.stampaFigli();
                        totale++;
                    }
e
                    if (padre != null && madre != null && madre.getNome().equals(padre.getNome())) {
                        System.out.println("Nota: stessa persona come padre e madre?");
                    }

                    int numFigli = 0;
                    if (padre != null) numFigli = padre.calcolaEta(); // fittizio
                    System.out.println("Totale persone nel nucleo familiare: " + (totale + numFigli));
                    break;

                case 5:
                    esci = true;
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
        System.out.println("Programma terminato.");
    }
}
