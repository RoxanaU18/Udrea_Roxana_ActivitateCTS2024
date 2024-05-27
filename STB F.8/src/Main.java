//DP folosit State

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz(101);

        // Oprire cand nu sunt calatori
        autobuz1.opresteInStatie();  // Autobuzul 101 se retrage la depou fara sa opreasca in statwie.

        // Setare stare autobuz cu calatori si oprire
        autobuz1.setStare(new AutobuzCuCalatori());
        autobuz1.opresteInStatie();  // Autobuzul 101 oprește in statie pentru ca are cală\atori.

        // Setare stare autobuz fara calatori si oprire
        autobuz1.setStare(new AutobuzFaraCalatori());
        autobuz1.opresteInStatie();  // Autobuzul 101 se retrage la depou fara sa opreasca in statie.
    }
}