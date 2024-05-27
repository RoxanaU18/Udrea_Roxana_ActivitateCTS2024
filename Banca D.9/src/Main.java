//DP folosit Composite

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("Sucursala 1");
        UnitateBancara agentie1 = new Agentie("Agentie 1");
        UnitateBancara agentie2 = new Agentie("Agentie 2");

        UnitateBancara filiala1 = new Filiala("Filiala 1");
        UnitateBancara filiala2 = new Filiala("Filiala 2");
        UnitateBancara filiala3 = new Filiala("Filiala 3");

        agentie1.adaugaUnitate(filiala1);
        agentie1.adaugaUnitate(filiala2);

        agentie2.adaugaUnitate(filiala3);

        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(agentie2);

        sucursala1.afiseazaDetalii();
    }
}