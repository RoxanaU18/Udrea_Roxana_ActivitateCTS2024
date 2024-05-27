public class SupaFactory {
    public static Supa createSupa(TipSupa tip) {
        switch (tip) {
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                throw new IllegalArgumentException("Tip de supa necunoscut: " + tip);
        }
    }
}