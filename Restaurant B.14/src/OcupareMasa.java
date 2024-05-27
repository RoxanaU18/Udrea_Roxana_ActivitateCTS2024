public abstract class OcupareMasa {

    // Template method
    public final void ocupareMasa() {
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();
}