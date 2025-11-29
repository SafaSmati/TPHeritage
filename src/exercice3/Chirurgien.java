package exercice3;

public class Chirurgien implements Medecin {

    @Override
    public void consulterPatient(String patient) {
        System.out.println("Consultation du patient : " + patient);
    }

    @Override
    public void prescrireTraitement(String traitement) {
        System.out.println("Prescription : " + traitement);
    }
}

