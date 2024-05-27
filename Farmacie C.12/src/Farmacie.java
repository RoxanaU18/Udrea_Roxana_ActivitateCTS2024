import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subject {
    private List<Observer> observatori = new ArrayList<>();

    @Override
    public void adaugaObserver(Observer observer) {
        observatori.add(observer);
    }

    @Override
    public void eliminaObserver(Observer observer) {
        observatori.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (Observer observer : observatori) {
            observer.actualizeaza(mesaj);
        }
    }

    public void adaugaOferta(String mesaj) {
        System.out.println("Oferta noua: " + mesaj);
        notificaObserveri(mesaj);
    }
}