//DP folosit Factory Method

public class Main {
    public static void main(String[] args) {
        PersonalSpital brancardier = PersonalFactory.createPersonal(TipPersonal.BRANCARDIER, "Ion Popescu");
        PersonalSpital asistent = PersonalFactory.createPersonal(TipPersonal.ASISTENT, "Maria Ionescu");
        PersonalSpital medic = PersonalFactory.createPersonal(TipPersonal.MEDIC, "Dr. Andrei Georgescu");

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();
    }
}