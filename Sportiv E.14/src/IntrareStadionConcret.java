public class IntrareStadionConcret extends IntrareStadion {

    @Override
    protected void aseazaLaCoada() {
        System.out.println("Se aseaza la coada.");
    }

    @Override
    protected void prezintaBiletul() {
        System.out.println("Se prezinta biletul.");
    }

    @Override
    protected void controlCorporal() {
        System.out.println("Se face controlul corporal.");
    }

    @Override
    protected void intraInStadion() {
        System.out.println("Se intra in stadion.");
    }

    @Override
    protected void ocupaLocul() {
        System.out.println("Se ocupa locul.");
    }
}