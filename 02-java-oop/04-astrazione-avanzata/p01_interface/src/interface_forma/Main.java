package interface_forma;

//Classe principale
public class Main {
 public static void main(String[] args) {
     Forma f1 = new Rettangolo(5, 3);
     Forma f2 = new Cerchio(2);

     System.out.println("Area rettangolo: " + f1.calcolaArea());
     System.out.println("Area cerchio: " + f2.calcolaArea());
 }
}
