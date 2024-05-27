public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String mesaj) {
        System.out.println(nume + " a primit notificarea: " + mesaj);
    }

    public String getNume() {
        return nume;
    }
}