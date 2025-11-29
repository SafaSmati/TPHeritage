package exercice1;

public class ProduitMedical {

    protected String code;
    protected String libelle;
    protected int stock;
    protected double prix;

    public ProduitMedical(String code, String libelle, int stock, double prix) {
        this.code = code;
        this.libelle = libelle;
        this.stock = stock;
        this.prix = prix;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    // Méthode afficher
    public void afficher() {
        System.out.println(libelle + " - Stock: " + stock + " - Prix: " + prix + "€");
    }
}

