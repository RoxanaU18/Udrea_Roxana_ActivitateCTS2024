import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Component {
    private String nume;
    private List<Component> copii;

    public Sectiune(String nume) {
        this.nume = nume;
        this.copii = new ArrayList<>();
    }

    @Override
    public void adauga(Component component) {
        copii.add(component);
    }

    @Override
    public void sterge(Component component) {
        copii.remove(component);
    }

    @Override
    public List<Component> getCopii() {
        return copii;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(nume);
        for (Component component : copii) {
            component.afiseazaDetalii();
        }
    }
}