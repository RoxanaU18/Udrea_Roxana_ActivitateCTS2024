public class TransportFactory {
    public static MijlocTransport createTransport(TipTransport tip) {
        switch (tip) {
            case AUTOBUZ:
                return new Autobuz();
            case TRAMVAI:
                return new Tramvai();
            case TROLEIBUZ:
                return new Troleibuz();
            default:
                throw new IllegalArgumentException("Tip de transport necunoscut: " + tip);
        }
    }
}