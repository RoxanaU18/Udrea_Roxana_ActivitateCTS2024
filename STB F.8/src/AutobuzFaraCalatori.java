public class AutobuzFaraCalatori implements StareAutobuz {
    @Override
    public void opresteInStatie(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNumar() + " se retrage la depou fara sa opreasca in statie.");
    }
}