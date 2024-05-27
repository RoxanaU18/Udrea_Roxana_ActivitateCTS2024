public class VanzareBiletProxy implements VanzareBilet {
    private VanzareBilet vanzareBilet;

    public VanzareBiletProxy(VanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(String numeClient, int varsta) {
        if (varsta >= 14) {
            vanzareBilet.vindeBilet(numeClient, varsta);
        } else {
            System.out.println("Vanzarea biletului refuzata pentru " + numeClient + ". Clientul trebuie sa aiba minim 14 ani.");
        }
    }
}