package exercice2;

public class Main {

    public static void main(String[] args) {

        Star[] stars = new Star[4];

        stars[0] = new Footballeur("Cristiano Ronaldo", "Portugais", 39, "Al Nassr", 20, 850, "Attaquant", 5, 5);
        stars[1] = new BasketBalleur("Michael Jordan", "Américain", 61, "Chicago Bulls", 15, 30.1, 6.2, 6, 6);
        stars[2] = new Chanteur("Michael Jackson", "Américain", 50, "Musique", 200, 13, 400);
        stars[3] = new Acteur("Tom Cruise", "Américain", 62, "Cinéma", 50, 3, "Mission Impossible");

        for (Star s : stars) {
            System.out.println("---");
            s.presenterMetier();
            s.afficherPalmares();
        }
    }
}
