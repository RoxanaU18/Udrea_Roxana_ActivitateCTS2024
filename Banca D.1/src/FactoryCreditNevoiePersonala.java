public class FactoryCreditNevoiePersonala implements CreditFactory {
    @Override
    public Credit createCredit() {
        return new CreditNevoiePersonala();
    }
}