package attributi_costruttori_v01;
/**
 * Classe Persona che rappresenta un oggetto con attributi e metodi
 */

public class Persona {

	public static void main(String[] args) {
		
		//Creazione di un oggetto Persona
		Persona persona1 = new Persona("Luigi", 35);
		
		// Uso dei metodi
		persona1.saluta();
		int annoNascita = persona1.calcolaAnnoNascita(2025);
		System.out.println("Sono nato nel " + annoNascita);
	}
		
		// Attributi (proprietà dell'oggetto)
		String nome;
		int eta;
		
		// Costruttori (inizializza l'oggetto)
		public Persona(String nomeInserito, int etaInserita) {
			nome = nomeInserito;
			eta = etaInserita;
		}
		// Metodo (comportamento)
		public void saluta() {
			System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + "");
		}
		
		// Metodo per calcolare l'anno di nascita
		public int calcolaAnnoNascita(int annoCorrente) {
			return annoCorrente - eta;
			}		
		
		}
