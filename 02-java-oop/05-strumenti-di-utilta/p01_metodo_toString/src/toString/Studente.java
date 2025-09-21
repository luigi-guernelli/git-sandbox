package toString;

public class Studente {
	
	private String nome;
	private int eta;
	
	public Studente(String nome, int eta) {
		this.nome=nome;
		this.eta=eta;
	}
	
	// @Override di toString()
	@Override
	public String toString() {
		return "Studente {nome = " + nome + ", eta = " + eta + "}"; 
		}
	}

