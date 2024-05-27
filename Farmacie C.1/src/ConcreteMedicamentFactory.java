public class ConcreteMedicamentFactory implements MedicamentFactory {
    public Medicament createMedicament(String denumire, double pret, Category categorie) {
        return new Medicament(denumire, pret, categorie);
    }
}