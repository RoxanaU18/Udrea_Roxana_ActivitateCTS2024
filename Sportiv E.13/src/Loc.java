public class Loc {
    private StareLoc stare;
    private int numar;

    public Loc(int numar) {
        this.numar = numar;
        this.stare = new StareLiber();
    }

    public void setStare(StareLoc stare) {
        this.stare = stare;
    }

    public void rezerva() {
        stare.rezerva(this);
    }

    public void ocupa() {
        stare.ocupa(this);
    }

    public void elibereaza() {
        stare.elibereaza(this);
    }

    public int getNumar() {
        return numar;
    }
}