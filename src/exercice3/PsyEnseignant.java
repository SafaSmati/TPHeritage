package exercice3;

public class PsyEnseignant implements Medecin, Enseignant {

    @Override
    public void consulterPatient(String patient) {
        System.out.println("Consultation du patient : " + patient);
    }

    @Override
    public void prescrireTraitement(String traitement) {
        System.out.println("Prescription : " + traitement);
    }

    @Override
    public void donnerCours(String matiere) {
        System.out.println("Donne cours de : " + matiere);
    }

    @Override
    public void preparerLecon(String chapitre) {
        System.out.println("Prépare leçon : " + chapitre);
    }
}

