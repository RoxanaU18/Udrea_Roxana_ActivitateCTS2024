import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara {
    private String nume;
    private List<UnitateBancara> unitati;

    public Sucursala(String nume) {
        this.nume = nume;
        this.unitati = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Sucursala: " + nume);
        for (UnitateBancara unitate : unitati) {
            unitate.afiseazaDetalii();
        }
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitate) {
        unitati.add(unitate);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitate) {
        unitati.remove(unitate);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return unitati.get(index);
    }
}