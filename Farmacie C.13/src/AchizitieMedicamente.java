public abstract class AchizitieMedicamente {

    // Template method
    public final void procesAchizitie() {
        primireReteta();
        if (verificareStoc()) {
            aducereMedicamente();
            incasareBani();
            scadereStoc();
            emitereBon();
        } else {
            refuzAchizitie();
        }
    }

    protected abstract void primireReteta();
    protected abstract boolean verificareStoc();
    protected abstract void aducereMedicamente();
    protected abstract void incasareBani();
    protected abstract void scadereStoc();
    protected abstract void emitereBon();
    protected abstract void refuzAchizitie();
}