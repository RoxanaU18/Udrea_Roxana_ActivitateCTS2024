//DP folosit Observer

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");
        Client client3 = new Client("Client 3");

        banca.adaugaObserver(client1);
        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);

        banca.notificaObservers("Noua oferta de credite este disponibila!");
        banca.notificaObservers("Serviciile de internet banking sunt acum disponibile!");

        banca.stergeObserver(client2);

        banca.notificaObservers("Client 2 nu va primi acest mesaj.");
    }
}