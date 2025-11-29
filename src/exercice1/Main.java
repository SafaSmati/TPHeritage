package exercice1;

public class Main {

    public static void main(String[] args) {

        ProduitMedical[] produits = new ProduitMedical[4];

        produits[0] = new Medicament("M01", "Paracétamol", 50, 5.5, "comprimé", 500, false);
        produits[1] = new Dispositif("D01", "Seringue", 100, 0.8, "injection", true, true);
        produits[2] = new Medicament("M02", "Amoxicilline", 30, 8.2, "gélule", 250, true);
        produits[3] = new Dispositif("D02", "Bandage", 80, 2.5, "pansement", false, true);

        System.out.println("=== AFFICHAGE DES PRODUITS ===");

        for (int i = 0; i < produits.length; i++) {
            produits[i].afficher();
        }
    }
}
