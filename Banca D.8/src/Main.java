//DP folosit Decorator

public class Main {
    public static void main(String[] args) {
        Credit credit = new CreditImpl();
        Credit ronCredit = new RONCreditDecorator(credit);

        ronCredit.createAccount("RON");  // Output: Account created in RON
        ronCredit.createAccount("USD");  // Output: Account creation failed. Only RON currency is allowed.
    }
}