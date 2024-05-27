//DP folosit Strategy

public class Main {
    public static void main(String[] args) {
        ValidatorCalatorie validator = new ValidatorCalatorie();

        validator.setStrategiePlata(new PlataCardCalatorii());
        validator.valideazaCalatorie(2.5);

        validator.setStrategiePlata(new PlataCardBancar());
        validator.valideazaCalatorie(5.0);

        validator.setStrategiePlata(new PlataSMS());
        validator.valideazaCalatorie(1.5);
    }
}