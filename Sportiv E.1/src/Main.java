//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        Jucator portar = JucatorFactory.createJucator(TipJucator.PORTAR);
        Jucator fundas = JucatorFactory.createJucator(TipJucator.FUNDAS);
        Jucator atacant = JucatorFactory.createJucator(TipJucator.ATACANT);

        portar.joaca();  // Output: Portarul apara poarta.
        fundas.joaca();  // Output: Fundasul apara zona.
        atacant.joaca(); // Output: Atacantul ataca poarta.
    }
}