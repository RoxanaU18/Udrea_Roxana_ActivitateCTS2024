import java.util.ArrayList;
import java.util.List;

public class Banca implements Subject {
    private List<Observer> clienti;

    public Banca() {
        this.clienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clienti.remove(observer);
    }

    @Override
    public void notificaObservers(String mesaj) {
        for (Observer client : clienti) {
            client.update(mesaj);
        }
    }
}