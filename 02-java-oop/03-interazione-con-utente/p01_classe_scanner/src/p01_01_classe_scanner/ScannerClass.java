package p01_01_classe_scanner;

import java.util.Scanner;

// Classe principlae
public class ScannerClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci il tuo nome: ");
		String nome = input.nextLine();

		System.out.print("Inserisci la tua età: ");
		int eta = input.nextInt();

		if (eta >= 18) {
			System.out.println("Ciao, " + nome + " sei maggiorenne!");
		} else {
			System.out.println("Ciao, " + nome + " sei minorenne!");
		}
		input.close();

	}

}
