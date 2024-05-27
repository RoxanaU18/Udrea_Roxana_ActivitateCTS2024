public class SupaLegumeFactory extends SupaFactory {
    @Override
    public Supa creareSupa() {
        return new SupaLegume();
    }
}