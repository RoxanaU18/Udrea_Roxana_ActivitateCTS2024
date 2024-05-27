//DP folosit Composite

public class Main {
    public static void main(String[] args) {
        Component tribuna = new Sectiune("Tribuna");
        Component peluza = new Sectiune("Peluza");
        Component tribunaNord = new Sectiune("Tribuna Nord");
        Component tribunaSud = new Sectiune("Tribuna Sud");
        Component tribunaVIP = new Sectiune("Tribuna VIP");

        Component loc1 = new Loc(1);
        Component loc2 = new Loc(2);
        Component loc3 = new Loc(3);
        Component loc4 = new Loc(4);

        tribuna.adauga(tribunaNord);
        tribuna.adauga(tribunaSud);
        tribuna.adauga(tribunaVIP);
        tribunaNord.adauga(loc1);
        tribunaNord.adauga(loc2);
        tribunaVIP.adauga(loc3);
        tribunaVIP.adauga(loc4);

        Component stadion = new Sectiune("Stadion");
        stadion.adauga(tribuna);
        stadion.adauga(peluza);

        stadion.afiseazaDetalii();
    }
}