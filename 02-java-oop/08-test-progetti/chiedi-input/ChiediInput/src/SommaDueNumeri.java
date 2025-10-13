import java.util.Scanner;

public class SommaDueNumeri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci due numeri: ");

        System.out.print("Numero1: ");
        int numero1=scanner.nextInt();

        System.out.print("Numero2: ");
        int numero2=scanner.nextInt();

        int somma= numero1+numero2;
        System.out.println("La somma dei due numeri è: " + somma);
        scanner.close();
    }
}
