public class ValidatorCalatorie {
    private Plata strategiePlata;

    public void setStrategiePlata(Plata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void valideazaCalatorie(double suma) {
        if (strategiePlata != null) {
            strategiePlata.plateste(suma);
        } else {
            System.out.println("Nu a fost selectata nicio metoda de plata.");
        }
    }
}