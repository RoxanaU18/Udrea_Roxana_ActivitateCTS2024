public class PlataSMS implements Plata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata prin SMS in valoare de " + suma + " RON a fost efectuata.");
    }
}