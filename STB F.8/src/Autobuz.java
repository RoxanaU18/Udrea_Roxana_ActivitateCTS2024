public class Autobuz {
    private StareAutobuz stare;
    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
        this.stare = new AutobuzFaraCalatori(); // Stare inițiala
    }

    public void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public void opresteInStatie() {
        stare.opresteInStatie(this);
    }
}