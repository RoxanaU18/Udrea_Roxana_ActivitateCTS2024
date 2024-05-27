public class MedicamentBody implements Medicament {
    private String denumire;
    private double pret;

    public MedicamentBody(String denumire, double pret) {
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
        System.out.println("Medicament pentru ingrijirea corpului: " + denumire + ", pret: " + pret);
    }
}