//DP folosit Abstract Factory

public class Main {
    public static void main(String[] args) {
        CreditFactory factoryNevoiePersonala = new FactoryCreditNevoiePersonala();
        CreditFactory factoryIpotecar = new FactoryCreditIpotecar();

        Credit creditNevoiePersonala = factoryNevoiePersonala.createCredit();
        Credit creditIpotecar = factoryIpotecar.createCredit();

        creditNevoiePersonala.descriere();
        creditIpotecar.descriere();
    }
}