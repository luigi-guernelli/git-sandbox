package getter_setter_v02;

public class Main {

	public static void main(String[] args) {
		
		// Creo uno studente
		Studente s1 = new Studente("Luigi", 35);
		
		//Uso i Getter
		System.out.println("Nome: " + s1.getNome());
		System.out.println("Età: " + s1.getEta());
		
		// Uso i setter per modificare i valori_
		s1.setNome("Mario");
		s1.setEta(32);
		
		// Aggiornamento dei dati utilizzando i setter
		System.out.println("Nuovo nome: " + s1.getNome());
		System.out.println("Nuovo età: " + s1.getEta());
		
		// Provo a impostare un'età non valida
		s1.setEta(-5);

	}

}
