public class FactoryPersoanaJuridica implements ClientFactory {
    @Override
    public Client createClient() {
        return new PersoanaJuridica();
    }
}