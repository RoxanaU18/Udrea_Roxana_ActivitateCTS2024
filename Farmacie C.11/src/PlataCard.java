public class PlataCard implements ModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul in valoare de " + suma + " lei a fost realizata.");
    }
}