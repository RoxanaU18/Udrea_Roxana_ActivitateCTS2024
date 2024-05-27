public class PlataCardBancar implements Plata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul bancar in valoare de " + suma + " RON a fost efectuata.");
    }
}