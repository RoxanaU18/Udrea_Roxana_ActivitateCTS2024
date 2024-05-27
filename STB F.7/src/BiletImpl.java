public class BiletImpl implements Bilet {
    private String detalii;

    public BiletImpl(String detalii) {
        this.detalii = detalii;
    }

    @Override
    public void printeaza() {
        System.out.println("Bilet: " + detalii);
    }
}