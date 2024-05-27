public class StareEmisa implements StareReteta {
    @Override
    public void solicitaReteta(Reteta reteta) {
        System.out.println("Reteta a fost solicitata la farmacie.");
        reteta.setStare(new StareSolicitata());
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Reteta nu poate fi achizitionata direct din starea emisa.");
    }
}