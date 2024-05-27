public class StareOcupat implements StareLoc {
    @Override
    public void rezerva(Loc loc) {
        System.out.println("Locul " + loc.getNumar() + " este ocupat si nu poate fi rezervat.");
    }

    @Override
    public void ocupa(Loc loc) {
        System.out.println("Locul " + loc.getNumar() + " este deja ocupat.");
    }

    @Override
    public void elibereaza(Loc loc) {
        loc.setStare(new StareLiber());
        System.out.println("Locul " + loc.getNumar() + " a fost eliberat.");
    }
}