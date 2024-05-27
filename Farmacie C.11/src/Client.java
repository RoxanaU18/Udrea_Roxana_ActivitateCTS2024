public class Client {
    private ModPlata modPlata;

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma) {
        if (modPlata != null) {
            modPlata.plateste(suma);
        } else {
            System.out.println("Modul de plata nu este setat.");
        }
    }
}