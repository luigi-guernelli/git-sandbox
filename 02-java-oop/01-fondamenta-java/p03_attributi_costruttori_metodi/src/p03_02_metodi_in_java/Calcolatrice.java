package p03_02_metodi_in_java;

//Definizione della classe
public class Calcolatrice {

	// Metodo senza parametri e senza ritorno
	void saluta() {
		System.out.println("Ciao, sono un calcolatrice!");
	}

	// Metodo con parametri e ritorno (somma di due numeri)
	int somma(int a, int b) {
		return a + b;
	}

	// Metodo con parametri e ritorno (sottrazione di due numeri)
	int sottrazione(int a, int b) {
		return a - b;
	}

	// Metodo con parametri e ritorno (moltiplicazione)
	int moltiplica(int a, int b) {
		return a * b;
	}

	// Metodo con parametri e ritorno (moltiplicazione)
	int divisione(int a, int b) {

		if (b != 0) {
			return a / b;
		} else {
			System.out.println("Errore il divisore non può essere 0!");
		}
		return b;

	}

}
