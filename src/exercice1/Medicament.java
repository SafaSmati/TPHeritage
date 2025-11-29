package exercice1;

public class Medicament extends ProduitMedical {

    private String forme;
    private int dosage;
    private boolean antibiotique;

    public Medicament(String code, String libelle, int stock, double prix,
                      String forme, int dosage, boolean antibiotique) {
        super(code, libelle, stock, prix);
        this.forme = forme;
        this.dosage = dosage;
        this.antibiotique = antibiotique;
    }

    @Override
    public void afficher() {
        System.out.println("Médicament - " + libelle +
                " - Stock: " + stock +
                " - Prix: " + prix + "€" +
                " - Forme: " + forme +
                " - Dosage: " + dosage + "mg" +
                " - Antibiotique: " + (antibiotique ? "oui" : "non"));
    }
}

