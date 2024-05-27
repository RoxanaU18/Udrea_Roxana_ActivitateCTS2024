//DP folosit Builder

public class Main {
    public static void main(String[] args) {
        ContBancar cont1 = new ContBancar.Builder()
                .setContDeSalariu()
                .setCardAtasat()
                .build();

        ContBancar cont2 = new ContBancar.Builder()
                .setInternetBanking()
                .build();

        ContBancar cont3 = new ContBancar.Builder()
                .build();

        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(cont3);
    }
}