import java.util.List;

public class Loc implements Component {
    private int numar;

    public Loc(int numar) {
        this.numar = numar;
    }

    @Override
    public void adauga(Component component) {
        // Nu se aplică pentru Loc
    }

    @Override
    public void sterge(Component component) {
        // Nu se aplică pentru Loc
    }

    @Override
    public List<Component> getCopii() {
        // Nu se aplică pentru Loc
        return null;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Loc " + numar);
    }
}