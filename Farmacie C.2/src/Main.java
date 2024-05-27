//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        Medicament medicamentRaceala = MedicamentFactory.createMedicament(CategorieMedicament.RACEALA, "Paracetamol", 10.0);
        Medicament medicamentDurere = MedicamentFactory.createMedicament(CategorieMedicament.DURERE, "Ibuprofen", 15.0);
        Medicament medicamentBody = MedicamentFactory.createMedicament(CategorieMedicament.BODY, "Crema hidratanta", 25.0);

        medicamentRaceala.descriere();
        medicamentDurere.descriere();
        medicamentBody.descriere();
    }
}