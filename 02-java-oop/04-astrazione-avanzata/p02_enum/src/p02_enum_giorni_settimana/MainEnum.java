package p02_enum_giorni_settimana;

public class MainEnum {
	public static void main(String[] args) {
		Giorno oggi = Giorno.SABATO;
		
		switch (oggi) {
		case SABATO:
		case DOMENICA:
			System.out.println("E' weekend!");
			break;
			default:
				System.out.println("E' un giorno lavorativo.");
		}
		
	}

}
