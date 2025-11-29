package exercice1;

public class Dispositif extends ProduitMedical {

    private String typeDispositif;
    private boolean sterile;
    private boolean usageUnique;

    public Dispositif(String code, String libelle, int stock, double prix,
                      String typeDispositif, boolean sterile, boolean usageUnique) {
        super(code, libelle, stock, prix);
        this.typeDispositif = typeDispositif;
        this.sterile = sterile;
        this.usageUnique = usageUnique;
    }

    @Override
    public void afficher() {
        System.out.println("Dispositif - " + libelle +
                " - Stock: " + stock +
                " - Prix: " + prix + "€" +
                " - Type: " + typeDispositif +
                " - Stérile: " + (sterile ? "oui" : "non") +
                " - Usage unique: " + (usageUnique ? "oui" : "non"));
    }
}
