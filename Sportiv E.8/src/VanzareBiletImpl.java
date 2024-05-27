public class VanzareBiletImpl implements VanzareBilet {
    @Override
    public void vindeBilet(String numeClient, int varsta) {
        System.out.println("Bilet vandut catre " + numeClient + " cu varsta de " + varsta + " ani.");
    }
}