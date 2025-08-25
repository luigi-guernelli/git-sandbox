package attributi_costruttori_v02;

// Classe con attributi e costruttore
public class Auto {

	// Attributi
	String marca;
	String modello;
	int anno;

	// Costruttore
	public Auto(String marca, String modello, int anno) {
		this.marca = marca; // "this" si riferisce all'attributo della classe
		this.modello = modello;
		this.anno = anno;
	}

	// Metodo
	void descriviAuto() {
		System.out.println("Questa è una " + marca + " " + modello + " del " + anno + ".");
	}

}
