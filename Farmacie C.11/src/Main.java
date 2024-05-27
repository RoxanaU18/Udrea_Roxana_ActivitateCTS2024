//DP folosit Strategy

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        // Clientul alege sa plateasca cu cardul
        client.setModPlata(new PlataCard());
        client.plateste(100.0);

        // Clientul alege sa plateasca cash
        client.setModPlata(new PlataCash());
        client.plateste(50.0);
    }
}