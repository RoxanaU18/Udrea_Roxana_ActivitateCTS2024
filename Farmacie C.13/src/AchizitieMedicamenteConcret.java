public class AchizitieMedicamenteConcret extends AchizitieMedicamente {

    @Override
    protected void primireReteta() {
        System.out.println("Reteta a fost primita.");
    }

    @Override
    protected boolean verificareStoc() {
        System.out.println("Verificare stoc medicamente.");
        // Simulăm că stocul este suficient pentru exemplu
        return true;
    }

    @Override
    protected void aducereMedicamente() {
        System.out.println("Medicamentele sunt aduse din depozit.");
    }

    @Override
    protected void incasareBani() {
        System.out.println("Banii au fost incasati.");
    }

    @Override
    protected void scadereStoc() {
        System.out.println("Stocul a fost scazut.");
    }

    @Override
    protected void emitereBon() {
        System.out.println("Bonul a fost emis.");
    }

    @Override
    protected void refuzAchizitie() {
        System.out.println("Achizitia a fost refuzata din cauza stocului insuficient.");
    }
}