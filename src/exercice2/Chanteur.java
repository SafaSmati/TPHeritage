package exercice2;

public class Chanteur extends Artiste {

    private int grammyAwards;
    private int albumsVendus;

    public Chanteur(String nom, String nationalite, int age, String domaineArt, int nombreOeuvres,
                    int grammyAwards, int albumsVendus) {
        super(nom, nationalite, age, domaineArt, nombreOeuvres);
        this.grammyAwards = grammyAwards;
        this.albumsVendus = albumsVendus;
    }

    @Override
    public void afficherPalmares() {
        System.out.println(grammyAwards + " Grammy Awards, " + albumsVendus + " millions d’albums vendus");
    }
}

