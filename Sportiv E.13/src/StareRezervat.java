public class StareRezervat implements StareLoc {
    @Override
    public void rezerva(Loc loc) {
        System.out.println("Locul " + loc.getNumar() + " este deja rezervat.");
    }

    @Override
    public void ocupa(Loc loc) {
        loc.setStare(new StareOcupat());
        System.out.println("Locul " + loc.getNumar() + " a fost ocupat.");
    }

    @Override
    public void elibereaza(Loc loc) {
        loc.setStare(new StareLiber());
        System.out.println("Locul " + loc.getNumar() + " a fost eliberat.");
    }
}