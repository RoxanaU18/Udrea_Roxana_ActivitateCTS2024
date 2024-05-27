//DP folosit Observer

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();

        Client client1 = new Client("Ion Popescu");
        Client client2 = new Client("Maria Ionescu");
        Client client3 = new Client("George Georgescu");

        farmacie.adaugaObserver(client1);
        farmacie.adaugaObserver(client2);
        farmacie.adaugaObserver(client3);

        farmacie.adaugaOferta("Reducere 20% la Paracetamol");
        farmacie.adaugaOferta("Reducere 15% la Ibuprofen");

        farmacie.eliminaObserver(client2);

        farmacie.adaugaOferta("Reducere 10% la Aspirina");
    }
}