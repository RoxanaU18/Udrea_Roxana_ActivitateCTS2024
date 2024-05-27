import java.util.List;

public interface Subject {
    void adaugaObserver(Observer observer);
    void eliminaObserver(Observer observer);
    void notificaObserveri(String mesaj);
}