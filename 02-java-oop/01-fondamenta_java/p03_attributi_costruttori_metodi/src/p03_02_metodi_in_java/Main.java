package p03_02_metodi_in_java;

// Classe principale
public class Main {

	public static void main(String[] args) {

		// Creo un oggetto calcolatrice
		Calcolatrice calc = new Calcolatrice();

		// Chiamo i metodo
		calc.saluta();

		int risultatoSomma = calc.somma(5, 3);
		int risultatoSottrazione = calc.sottrazione(5, 2);
		int risultatoMoltiplicazione = calc.moltiplica(5, 3);
		int risultatoDivisione = calc.divisione(10, 2);

		System.out.println("5 + 3 = " + risultatoSomma);
		System.out.println("5 - 2 = " + risultatoSottrazione);
		System.out.println("5 * 3 = " + risultatoMoltiplicazione);
		System.out.println("10 / 2 = " + risultatoDivisione);

	}

}
