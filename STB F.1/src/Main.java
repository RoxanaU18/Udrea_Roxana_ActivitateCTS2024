
//DP folosit Factory Method
public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = TransportFactory.createTransport(TipTransport.AUTOBUZ);
        MijlocTransport tramvai = TransportFactory.createTransport(TipTransport.TRAMVAI);
        MijlocTransport troleibuz = TransportFactory.createTransport(TipTransport.TROLEIBUZ);

        autobuz.afiseazaDetalii();  // Output: Acesta este un autobuz.
        tramvai.afiseazaDetalii();  // Output: Acesta este un tramvai.
        troleibuz.afiseazaDetalii(); // Output: Acesta este un troleibuz.
    }
}