package main.versione1;

public class Main {
    public static void main(String[] args) {
        Madre madre = new Madre("Maria", "Rossi", "MRARSS70A01H501Y", 50);
        Padre padre = new Padre("Luca", "Rossi", "LCRRSS65B02H501Y", 55);
        Figlio figlio = new Figlio("Giovanni", "Rossi", "GVRRSS10C03H501Y", 15, "Maschio");

        System.out.println("=== DATI MADRE ===");
        madre.stampaInformazioni();
        madre.curaFiglio();

        System.out.println("\n=== DATI PADRE ===");
        padre.stampaInformazioni();
        padre.lavora();

        System.out.println("\n=== DATI FIGLIO ===");
        figlio.stampaInformazioni();
        figlio.gioca();
    }
}