//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        Supa supaLegume = SupaFactory.createSupa(TipSupa.LEGUME);
        Supa supaCiuperci = SupaFactory.createSupa(TipSupa.CIUPERCI);
        Supa supaVita = SupaFactory.createSupa(TipSupa.VITA);

        supaLegume.descriere();
        supaCiuperci.descriere();
        supaVita.descriere();
    }
}