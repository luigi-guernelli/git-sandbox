package p03_01_menu_ciclico;

import java.util.Scanner;

public class MenuCiclico {
		public static void main(String[] args) {

			// Creazione dello scanner
			Scanner scanner = new Scanner(System.in);
			
			// Lettura scelta dall'utente
						int scelta;

			// Stampa del menu
			do {
				
				System.out.println("===== MENU PRINCIPALE =====");
				System.out.println("1. Saluta");
				System.out.println("2. Calcola somma");
				System.out.println("3. Esci");
				System.out.print("Scegli un'opzione(1-3): ");
				
				scelta = scanner.nextInt();
				
				// Controlle della scelta
				switch (scelta) {
				case 1:
					System.out.println("Ciao utente, benvenuto");
					break;

				case 2:
					System.out.print("Inserisci il primo numero: ");
					int numero1 = scanner.nextInt();

					System.out.print("Inserisci il secondo numero: ");
					int numero2 = scanner.nextInt();
					
					int somma = numero1 + numero2;
					System.out.print("La somma è: " + somma);
					break;

				case 3:
					System.out.println("Uscita dal programma . . . Arrivederici!");
					break;

				default:
					System.out.println("Scelta non valida. Riprova.");

				}
				
			} while (scelta != 3); // Ripeti finchè la scelta NON è 3


			// Chiudiamo lo scanner
			scanner.close();

		}

	}
