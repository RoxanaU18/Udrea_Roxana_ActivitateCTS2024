public class JucatorFactory {
    public static Jucator createJucator(TipJucator tip) {
        switch (tip) {
            case PORTAR:
                return new Portar();
            case FUNDAS:
                return new Fundas();
            case ATACANT:
                return new Atacant();
            default:
                throw new IllegalArgumentException("Tip de jucator necunoscut: " + tip);
        }
    }
}