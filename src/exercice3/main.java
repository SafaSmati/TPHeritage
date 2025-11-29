package exercice3;

public class main {

    public static void main(String[] args) {

        Medecin chirurgien = new Chirurgien();
        Enseignant professeur = new Professeur();
        Militaire officier = new Officier();
        Medecin psy = new PsyEnseignant();
        Enseignantmilitaire em = new Enseignantmilitaire("Lieutenant Mohamed Salah Channoufi");

        System.out.println("=== CHIRURGIEN ===");
        chirurgien.consulterPatient("Marie Dupont");
        chirurgien.prescrireTraitement("Opération cardiaque");

        System.out.println("=== PROFESSEUR ===");
        professeur.donnerCours("Mathématiques");
        professeur.preparerLecon("Algèbre linéaire");

        System.out.println("=== OFFICIER ===");
        officier.executerOrdre("Patrouille de sécurité");
        officier.porterUniforme();

        System.out.println("=== PSYCHOLOGUE ENSEIGNANT ===");
        psy.consulterPatient("Sophie Martin");
        ((PsyEnseignant) psy).donnerCours("Psychologie clinique");

        System.out.println("=== ENSEIGNANT MILITAIRE ===");
        em.donnerCours("Programmation Orientée Objet");
        em.executerOrdre("Formation des recrues");
        em.porterUniforme();
    }
}

