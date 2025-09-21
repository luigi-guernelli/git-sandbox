package azienda;

public class Dipendente {
	// Attributi con accesso diverso
	private String nome; 			// accessibile solo dentro la classe
	protected double stipendio;		// accessibile in sottoclassi o stesso package
	public String reparto;			// accessibile da ovunque
	int eta;						// defaul: accessibile solo nello stesso package
	
	// Costruttore
	public Dipendente(String nome, double stipendio, String reparto, int eta) {
		this.nome=nome;
		this.stipendio=stipendio;
		this.reparto=reparto;
		this.eta=eta;
	}
	
	// Getter per nome (private)
	public String getNome() {
		return nome;
	}
	
	// Metodo pubblico
	public void mostraInfo() {
		System.out.println("Nome: " + nome + "Stipendio: " + stipendio + 
				"Reparto: "+reparto + "Età: " +eta);
		
	}
	

}
