import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi = new ArrayList<>();

    public void preiaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void executaComenzi() {
        for (Comanda comanda : comenzi) {
            comanda.executa();
        }
        comenzi.clear();
    }
}