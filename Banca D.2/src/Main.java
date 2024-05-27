//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        ClientFactory factoryPersoanaFizica = new FactoryPersoanaFizica();
        ClientFactory factoryPersoanaJuridica = new FactoryPersoanaJuridica();

        Client clientFizic = factoryPersoanaFizica.createClient();
        Client clientJuridic = factoryPersoanaJuridica.createClient();

        clientFizic.descriere();
        clientJuridic.descriere();
    }
}