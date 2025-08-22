package p03_01_attributi_costruttori;

// Classe principale
public class Main {

	public static void main(String[] args) {
		
		// Creo oggetti usando il costruttore
		Auto a1 = new Auto("Fiat", "Panda", 2010);
		Auto a2 = new Auto("BMW", "Serie 1", 2022);
		
		// Chiamo il metodo
		a1.descriviAuto();
		a2.descriviAuto();
	}

}
