public class BiletCuMesaj extends BiletDecorator {
    public BiletCuMesaj(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        printeazaMesaj();
    }

    private void printeazaMesaj() {
        System.out.println("Mesaj: La multi ani!");
    }
}