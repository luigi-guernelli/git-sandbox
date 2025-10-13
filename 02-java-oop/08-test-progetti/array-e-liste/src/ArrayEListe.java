import java.util.ArrayList;

public class ArrayEListe {
    public static void main(String[] args){
        String[] frutti={"Mela", "Banana", "Arancia"}; // Array Fisso
        System.out.println(frutti[0]); // Stampa "Mela"

        ArrayList<String> listaSpesa = new ArrayList<>(); // Lista dinamica
        listaSpesa.add("Pane");
        listaSpesa.add("Latte");
        System.out.printf(listaSpesa.get(1)); // Stampa "Latte"

    }
}
