//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        SupaFactory supaLegumeFactory = new SupaLegumeFactory();
        SupaFactory supaCiuperciFactory = new SupaCiuperciFactory();
        SupaFactory supaVitaFactory = new SupaVitaFactory();

        Supa supaLegume = supaLegumeFactory.creareSupa();
        Supa supaCiuperci = supaCiuperciFactory.creareSupa();
        Supa supaVita = supaVitaFactory.creareSupa();

        supaLegume.descriere();
        supaCiuperci.descriere();
        supaVita.descriere();
    }
}