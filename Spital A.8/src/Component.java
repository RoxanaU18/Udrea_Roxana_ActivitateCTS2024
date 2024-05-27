import java.util.List;

public interface Component {
    void adauga(Component component);
    void sterge(Component component);
    List<Component> getCopii();
    void afiseazaDetalii();
}