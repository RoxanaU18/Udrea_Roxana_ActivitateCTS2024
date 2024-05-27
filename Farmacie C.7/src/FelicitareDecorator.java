public class FelicitareDecorator extends BonDecorator {

    public FelicitareDecorator(Printabil bon) {
        super(bon);
    }

    @Override
    public void printare() {
        bon.printare();
        printareFelicitare();
    }

    private void printareFelicitare() {
        System.out.println("La Multi Ani!");
    }
}