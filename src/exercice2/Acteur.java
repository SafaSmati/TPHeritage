package exercice2;

public class Acteur extends Artiste {

    private int goldenGlobes;
    private String filmsCultes;

    public Acteur(String nom, String nationalite, int age, String domaineArt, int nombreOeuvres,
                  int goldenGlobes, String filmsCultes) {
        super(nom, nationalite, age, domaineArt, nombreOeuvres);
        this.goldenGlobes = goldenGlobes;
        this.filmsCultes = filmsCultes;
    }

    @Override
    public void presenterMetier() {
        System.out.println("Je suis " + nom + ", acteur de cinéma");
    }

    @Override
    public void afficherPalmares() {
        System.out.println(goldenGlobes + " Golden Globes, " + filmsCultes);
    }
}

