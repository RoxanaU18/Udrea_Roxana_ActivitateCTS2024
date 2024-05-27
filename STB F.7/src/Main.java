//DP folosit Decorator

public class Main {
    public static void main(String[] args) {
        Bilet biletSimplu = new BiletImpl("Detalii bilet standard.");
        Bilet biletCuMesaj = new BiletCuMesaj(biletSimplu);

        System.out.println("Printare bilet simplu:");
        biletSimplu.printeaza();  // Output: Bilet: Detalii bilet standard.

        System.out.println("\nPrintare bilet cu mesaj:");
        biletCuMesaj.printeaza();  // Output: Bilet: Detalii bilet standard.
        //         Mesaj: La multi ani!
    }
}