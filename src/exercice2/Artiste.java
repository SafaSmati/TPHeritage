package exercice2;

public class Artiste extends Star {

    protected String domaineArt;
    protected int nombreOeuvres;

    public Artiste(String nom, String nationalite, int age, String domaineArt, int nombreOeuvres) {
        super(nom, nationalite, age);
        this.domaineArt = domaineArt;
        this.nombreOeuvres = nombreOeuvres;
    }

    @Override
    public void presenterMetier() {
        System.out.println("Je suis " + nom + ", artiste dans " + domaineArt);
    }

    @Override
    public void afficherPalmares() {
        System.out.println("Palmarès : à définir selon l’artiste");
    }
}

