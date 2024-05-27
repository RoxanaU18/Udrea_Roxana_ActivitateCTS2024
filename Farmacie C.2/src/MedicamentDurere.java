public class MedicamentDurere implements Medicament {
    private String denumire;
    private double pret;

    public MedicamentDurere(String denumire, double pret) {
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
        System.out.println("Medicament pentru durere: " + denumire + ", pret: " + pret);
    }
}