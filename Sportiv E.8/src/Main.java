//DP folosit Proxy

public class Main {
    public static void main(String[] args) {
        VanzareBilet vanzareBilet = new VanzareBiletImpl();
        VanzareBilet proxy = new VanzareBiletProxy(vanzareBilet);

        proxy.vindeBilet("Ion Popescu", 16);  // Output: Bilet vandut catre Ion Popescu cu varsta de 16 ani.
        proxy.vindeBilet("Maria Ionescu", 13); // Output: Vanzarea biletului refuzata pentru Maria Ionescu. Clientul trebuie sa aiba minim 14 ani.
    }
}