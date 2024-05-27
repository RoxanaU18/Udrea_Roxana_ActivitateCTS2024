public abstract class Bancomat {

    // Template method
    public final void retragereBani() {
        introduceCard();
        introducePIN();
        specificaSuma();
        retrageBanii();
        retrageCardul();
    }

    protected abstract void introduceCard();
    protected abstract void introducePIN();
    protected abstract void specificaSuma();
    protected abstract void retrageBanii();
    protected abstract void retrageCardul();
}