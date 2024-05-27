//DP folosit State

public class Main {
    public static void main(String[] args) {
        Loc loc1 = new Loc(1);

        loc1.rezerva();  // Output: Locul 1 a fost rezervat.
        loc1.rezerva();  // Output: Locul 1 este deja rezervat.
        loc1.ocupa();    // Output: Locul 1 a fost ocupat.
        loc1.rezerva();  // Output: Locul 1 este ocupat si nu poate fi rezervat.
        loc1.elibereaza();  // Output: Locul 1 a fost eliberat.
        loc1.ocupa();    // Output: Locul 1 a fost ocupat.
        loc1.elibereaza();  // Output: Locul 1 a fost eliberat.
    }
}