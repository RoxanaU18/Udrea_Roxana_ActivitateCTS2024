public class OcupareMasaConcret extends OcupareMasa {

    @Override
    protected void curataMasa() {
        System.out.println("Se curata masa.");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Se aseaza șervetele.");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se aseaza tacamuri.");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Persoanele sunt invitate sa se aseze la masa.");
    }
}