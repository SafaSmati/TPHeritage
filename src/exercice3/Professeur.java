package exercice3;

public class Professeur implements Enseignant {

    @Override
    public void donnerCours(String matiere) {
        System.out.println("Donne cours de : " + matiere);
    }

    @Override
    public void preparerLecon(String chapitre) {
        System.out.println("Prépare leçon : " + chapitre);
    }
}
