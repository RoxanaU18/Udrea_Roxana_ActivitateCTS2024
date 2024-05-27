public class StareLiber implements StareLoc {
    @Override
    public void rezerva(Loc loc) {
        loc.setStare(new StareRezervat());
        System.out.println("Locul " + loc.getNumar() + " a fost rezervat.");
    }

    @Override
    public void ocupa(Loc loc) {
        loc.setStare(new StareOcupat());
        System.out.println("Locul " + loc.getNumar() + " a fost ocupat.");
    }

    @Override
    public void elibereaza(Loc loc) {
        System.out.println("Locul " + loc.getNumar() + " este deja liber.");
    }
}