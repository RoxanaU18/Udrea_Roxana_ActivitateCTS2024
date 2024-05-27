public class Reteta {
    private StareReteta stare;
    private String numePacient;

    public Reteta(String numePacient) {
        this.numePacient = numePacient;
        this.stare = new StareEmisa(); // Stare inițială
    }

    public void setStare(StareReteta stare) {
        this.stare = stare;
    }

    public void solicitaReteta() {
        stare.solicitaReteta(this);
    }

    public void achizitioneazaReteta() {
        stare.achizitioneazaReteta(this);
    }

    public String getNumePacient() {
        return numePacient;
    }
}