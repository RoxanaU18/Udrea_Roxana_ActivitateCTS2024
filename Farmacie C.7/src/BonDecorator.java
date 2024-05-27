public abstract class BonDecorator implements Printabil {
    protected Printabil bon;

    public BonDecorator(Printabil bon) {
        this.bon = bon;
    }

    @Override
    public void printare() {
        bon.printare();
    }
}