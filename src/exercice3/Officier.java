package exercice3;

public class Officier implements Militaire {

    @Override
    public void executerOrdre(String ordre) {
        System.out.println("Exécute l’ordre : " + ordre);
    }

    @Override
    public void porterUniforme() {
        System.out.println("Porte l’uniforme militaire");
    }
}

