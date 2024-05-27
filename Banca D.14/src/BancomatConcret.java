public class BancomatConcret extends Bancomat {

    @Override
    protected void introduceCard() {
        System.out.println("Cardul a fost introdus.");
    }

    @Override
    protected void introducePIN() {
        System.out.println("PIN-ul a fost introdus.");
    }

    @Override
    protected void specificaSuma() {
        System.out.println("Suma solicitata a fost specificata.");
    }

    @Override
    protected void retrageBanii() {
        System.out.println("Banii au fost retrasi.");
    }

    @Override
    protected void retrageCardul() {
        System.out.println("Cardul a fost retras.");
    }
}