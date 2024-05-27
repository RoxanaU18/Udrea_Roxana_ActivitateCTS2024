public class RONCreditDecorator implements Credit {
    private Credit decoratedCredit;

    public RONCreditDecorator(Credit decoratedCredit) {
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void createAccount(String currency) {
        if ("RON".equalsIgnoreCase(currency)) {
            decoratedCredit.createAccount(currency);
        } else {
            System.out.println("Creare cod nereusita. Doar moneda RON este permisa.");
        }
    }
}