public class Filiala implements UnitateBancara {
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Filiala: " + nume);
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitate) {
    }

    @Override
    public void stergeUnitate(UnitateBancara unitate) {
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return null;
    }
}