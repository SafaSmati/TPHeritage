package exercice2;

public class BasketBalleur extends Sportif {

    private double pointsParMatch;
    private double rebondsParMatch;
    private int titresNBA;
    private int mvpFinals;

    public BasketBalleur(String nom, String nationalite, int age, String club, int anneesExperience, double pointsParMatch, double rebondsParMatch, int titresNBA, int mvpFinals) {
        super(nom, nationalite, age, club, anneesExperience);
        this.pointsParMatch = pointsParMatch;
        this.rebondsParMatch = rebondsParMatch;
        this.titresNBA = titresNBA;
        this.mvpFinals = mvpFinals;
    }

    @Override
    public void presenterMetier() {
        System.out.println("Je suis " + nom + ", basketteur professionnel");
    }

    @Override
    public void afficherPalmares() {
        System.out.println("Palmarès : " + titresNBA + " titres NBA, " + mvpFinals + " MVP Finals");
    }

    @Override
    public void afficherStatistiques() {
        System.out.println("Statistiques : " + pointsParMatch + " points/match, " + rebondsParMatch + " rebonds/match");
    }
}

