public class PlataCash implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash an valoare de " + suma + " lei a fost realizata.");
    }
}