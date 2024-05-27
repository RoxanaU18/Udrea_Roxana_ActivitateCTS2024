//DP folosit Decorator

public class Main {
    public static void main(String[] args) {
        Printabil bon = new BonDeCasa();
        Printabil bonCuFelicitare = new FelicitareDecorator(bon);

        // Printare bon fara felicitare
        bon.printare();

        // Printare bon cu felicitare
        bonCuFelicitare.printare();
    }
}