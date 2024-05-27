public class StareAchizitionata implements StareReteta {
    @Override
    public void solicitaReteta(Reteta reteta) {
        System.out.println("Reteta a fost deja achizitionata.");
    }

    @Override
    public void achizitioneazaReteta(Reteta reteta) {
        System.out.println("Reteta a fost deja achizitionata.");
    }
}