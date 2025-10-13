import java.util.Scanner;

public class ChiediInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Come ti chiami? ");
        String nome = scanner.nextLine();
        System.out.println("Benvenuto," + nome + "!");
    }
}
