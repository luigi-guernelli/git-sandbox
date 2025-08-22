package p02_classi_e_oggetti;

// Classe principale con il metodo main
public class Main {
	public static void main (String[] args) {
		
		// Creazione di un oggetto della classe studente
		Studente s1 = new Studente();
		
		// Assegnazione valori agli attributi
		s1.nome = "Luigi";
		s1.eta = 20;
		
		// Invocazione del metodo
		s1.presentaStudente();
	}
}