public class MedicamentRaceala implements Medicament {
    private String denumire;
    private double pret;

    public MedicamentRaceala(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void descriere() {
        System.out.println("Medicament pentru raceala: " + denumire + ", pret: " + pret);
    }
}