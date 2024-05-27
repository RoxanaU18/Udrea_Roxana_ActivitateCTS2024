public class Masa {
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
    }

    public void rezervare() {
        System.out.println("Masa " + numar + " a fost rezervata.");
    }

    public void ocupare() {
        System.out.println("Masa " + numar + " a fost ocupata.");
    }
}