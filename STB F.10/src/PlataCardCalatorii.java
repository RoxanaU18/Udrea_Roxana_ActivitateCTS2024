public class PlataCardCalatorii implements Plata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul STB in valoare de " + suma + " RON a fost efectuata.");
    }
}