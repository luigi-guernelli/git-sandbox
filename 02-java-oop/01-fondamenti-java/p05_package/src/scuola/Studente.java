package scuola;

//Definizione della classe
public class Studente {
	
	// Attributi privati
	private String nome;
	private int eta;
	
	// Costruttore
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	// Metodo
	public void presentaStudente() {
		System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
	}

}
