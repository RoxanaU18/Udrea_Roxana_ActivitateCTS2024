//DP folosit Command

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);

        Comanda comandaRezervare1 = new ComandaRezervare(masa1);
        Comanda comandaOcupare1 = new ComandaOcupare(masa1);
        Comanda comandaRezervare2 = new ComandaRezervare(masa2);
        Comanda comandaOcupare2 = new ComandaOcupare(masa2);

        Operator operator = new Operator();
        operator.preiaComanda(comandaRezervare1);
        operator.preiaComanda(comandaOcupare1);
        operator.preiaComanda(comandaRezervare2);
        operator.preiaComanda(comandaOcupare2);

        operator.executaComenzi();
    }
}