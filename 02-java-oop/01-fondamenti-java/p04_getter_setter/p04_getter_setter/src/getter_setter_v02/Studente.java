package getter_setter_v02;

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

	// Getter per nome
	public String getNome() {
		return nome;
	}

	// Setter per nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter per eta
	public int getEta() {
		return eta;
	}

	// ****** Setter per eta (con controllo) ******
	public void setEta(int eta) {

		if (eta >= 0) { // controllo logico
			this.eta = eta;
		} else {
			System.out.println("Errore: eta non valida!");
		}

	}

}
