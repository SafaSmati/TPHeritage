package exercice2;

public class Footballeur extends Sportif {

    private int nombreButs;
    private String poste;
    private int ballonsOr;
    private int liguesDesChampions;

    public Footballeur(String nom, String nationalite, int age, String club, int anneesExperience,
                       int nombreButs, String poste, int ballonsOr, int liguesDesChampions) {
        super(nom, nationalite, age, club, anneesExperience);
        this.nombreButs = nombreButs;
        this.poste = poste;
        this.ballonsOr = ballonsOr;
        this.liguesDesChampions = liguesDesChampions;
    }

    @Override
    public void presenterMetier() {
        System.out.println("Je suis " + nom + ", footballeur professionnel");
    }

    @Override
    public void afficherPalmares() {
        System.out.println("Palmarès : " + ballonsOr + " Ballons d’Or, " + liguesDesChampions + " Ligue des Champions");
    }

    @Override
    public void afficherStatistiques() {
        System.out.println("Statistiques : " + nombreButs + " buts, poste : " + poste);
    }
}
