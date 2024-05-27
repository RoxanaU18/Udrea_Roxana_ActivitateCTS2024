public class FactoryCreditIpotecar implements CreditFactory {
    @Override
    public Credit createCredit() {
        return new CreditIpotecar();
    }
}