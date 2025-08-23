package p01_01_switch;

public class SwitchGiorni {
public static void main(String[] args) {
	int giorno = 5;
	
	switch (giorno) {
	case 1:
		System.out.println("Lunedì");
		break;
		
	case 2:
		System.out.println("Martedì");
		break;
		
	case 3:
		System.out.println("Mercoledì");
		break;
		
	case 4:
		System.out.println("Giovedì");
		break;
		
	case 5:
		System.out.println("Venerdì");
		break;
		
		default:
			System.out.println("Weekend");
	}
}
}
