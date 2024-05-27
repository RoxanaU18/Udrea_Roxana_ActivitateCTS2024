public class StareSolicitata implements StareReteta {
    @Override
    public void solicitaReteta(Reteta reteta) {
        System.out.println("Reteta este deja solicitata la farmacie.");
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Reteta a fost achizitionata.");
        reteta.setStare(new StareAchizitionata());
    }
}