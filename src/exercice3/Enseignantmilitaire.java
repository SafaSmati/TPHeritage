package exercice3;

public class Enseignantmilitaire implements Enseignant, Militaire {

    private String nom;

    public Enseignantmilitaire(String nom) {
        this.nom = nom;
    }

    @Override
    public void donnerCours(String matiere) {
        System.out.println(nom + " donne cours de : " + matiere);
    }

    @Override
    public void preparerLecon(String chapitre) {
        System.out.println(nom + " prépare leçon : " + chapitre);
    }

    @Override
    public void executerOrdre(String ordre) {
        System.out.println(nom + " exécute l’ordre : " + ordre);
    }

    @Override
    public void porterUniforme() {
        System.out.println(nom + " porte l’uniforme militaire");
    }
}
