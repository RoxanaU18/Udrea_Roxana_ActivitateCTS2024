//DP folosit Factory Method

public class Main {
        public static void main(String[] args) {
            MedicamentFactory factory = new ConcreteMedicamentFactory();

            Medicament medicament1 = factory.createMedicament("Paracetamol", 10.0, Category.RACEALA);
            Medicament medicament2 = factory.createMedicament("Ibuprofen", 15.0, Category.DURERE);
            Medicament medicament3 = factory.createMedicament("Vitamina C", 8.0, Category.BODY);

            System.out.println(medicament1);
            System.out.println(medicament2);
            System.out.println(medicament3);
        }
    }

