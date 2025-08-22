package p05_biblioteca;

//Definizione della classe
public class Libro {
	
	// Attributi privati
	private String titolo;
	private String autore;
	
	// Costruttore
	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
	}
	
	// Metodo
	public void descriviLibro() {
        System.out.println("Il libro \"" + titolo + "\" scritto da " + autore + ".");
	}

}
