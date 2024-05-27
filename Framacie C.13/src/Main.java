//DP folosit State

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta("Ion Popescu");

        // Tranziții de stare
        reteta.solicitaReteta();
        reteta.achizitioneazaReteta();
        reteta.solicitaReteta();
        reteta.achizitioneazaReteta();
    }
}