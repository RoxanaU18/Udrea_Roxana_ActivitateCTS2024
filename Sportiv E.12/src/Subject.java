import java.util.List;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObservers(String mesaj);
}