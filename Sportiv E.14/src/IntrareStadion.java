public abstract class IntrareStadion {

    // Template method
    public final void procesIntrare() {
        aseazaLaCoada();
        prezintaBiletul();
        controlCorporal();
        intraInStadion();
        ocupaLocul();
    }

    protected abstract void aseazaLaCoada();
    protected abstract void prezintaBiletul();
    protected abstract void controlCorporal();
    protected abstract void intraInStadion();
    protected abstract void ocupaLocul();
}