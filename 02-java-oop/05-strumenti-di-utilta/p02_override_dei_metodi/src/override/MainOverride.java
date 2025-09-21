package override;

public class MainOverride {
    public static void main(String[] args) {
        Animale a1 = new Cane();
        Animale a2 = new Gatto();

        a1.verso(); // Output: Bau!
        a2.verso(); // Output: Miao!
    }
}
