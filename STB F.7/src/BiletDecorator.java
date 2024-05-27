public abstract class BiletDecorator implements Bilet {
    protected Bilet bilet;

    public BiletDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }
}