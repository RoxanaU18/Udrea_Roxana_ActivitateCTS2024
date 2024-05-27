public class CreditImpl implements Credit {
    @Override
    public void createAccount(String currency) {
        System.out.println("Cont creat in " + currency);
    }
}