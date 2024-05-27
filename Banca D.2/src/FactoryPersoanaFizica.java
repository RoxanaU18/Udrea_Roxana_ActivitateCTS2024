public class FactoryPersoanaFizica implements ClientFactory {
    @Override
    public Client createClient() {
        return new PersoanaFizica();
    }
}