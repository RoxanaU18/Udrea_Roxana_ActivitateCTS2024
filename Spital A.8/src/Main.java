//DP folosit Composite

public class Main {
    public static void main(String[] args) {
        Component departamentGeneral = new Departament("Departament General");
        Component departamentChirurgie = new Departament("Departament Chirurgie");
        Component sectieOrtopedie = new Sectie("Sectie Ortopedie");
        Component sectieCardiologie = new Sectie("Sectie Cardiologie");
        Component sectiePediatrie = new Sectie("Sectie Pediatrie");

        departamentChirurgie.adauga(sectieOrtopedie);
        departamentChirurgie.adauga(sectieCardiologie);
        departamentGeneral.adauga(departamentChirurgie);
        departamentGeneral.adauga(sectiePediatrie);

        departamentGeneral.afiseazaDetalii();
    }
}