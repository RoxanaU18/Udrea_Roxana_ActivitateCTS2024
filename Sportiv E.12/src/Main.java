//Dp folosit Observer

public class Main {
    public static void main(String[] args) {
        SalaSport salaSport = new SalaSport();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");
        Client client3 = new Client("Client 3");

        salaSport.adaugaObserver(client1);
        salaSport.adaugaObserver(client2);
        salaSport.adaugaObserver(client3);

        salaSport.notificaObservers("Noul meci de fotbal este programat pentru vineri, ora 18:00.");
        salaSport.notificaObservers("Noul meci de handbal este programat pentru sambata, ora 15:00.");
        salaSport.notificaObservers("Noul meci de volei este programat pentru duminica, ora 12:00.");

        salaSport.stergeObserver(client2);

        salaSport.notificaObservers("Meciul de baschet este programat pentru luni, ora 20:00.");
    }
}