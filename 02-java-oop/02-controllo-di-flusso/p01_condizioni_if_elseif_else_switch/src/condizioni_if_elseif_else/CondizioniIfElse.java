package condizioni_if_elseif_else;

// Classe principale
public class CondizioniIfElse {
	public static void main(String[] args) {
		
		// Attributo inizializzato e dichiarato con un valore di default
		int voto = 7;
		
		// Ciclo condizionale if - els if - else
		if (voto >= 9) {
			System.out.println("Eccellente");
			
		} else if (voto >= 6) {
			System.out.println("Sufficiente");
		
		} else {
			System.out.println("Insufficiente");
		}

	}

}
