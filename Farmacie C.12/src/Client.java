public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Clientul " + nume + " a fost notificat despre: " + mesaj);
    }
}