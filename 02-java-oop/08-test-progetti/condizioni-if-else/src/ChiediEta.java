import java.util.Scanner;

public class ChiediEta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti anni hai? ");
        int eta = scanner.nextInt();

        if (eta >= 18) {
            System.out.println("Sei maggiorenne!");
        } else {
            System.out.println("Sei minorenne!");
        }
        scanner.close();
    }
}
