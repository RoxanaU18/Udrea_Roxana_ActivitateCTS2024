import java.util.List;

public class Sectie implements Component {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(Component component) {
    }

    @Override
    public void sterge(Component component) {
    }

    @Override
    public List<Component> getCopii() {
        return null;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Secție: " + nume);
    }
}