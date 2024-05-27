public class SupaVitaFactory extends SupaFactory {
    @Override
    public Supa creareSupa() {
        return new SupaVita();
    }
}