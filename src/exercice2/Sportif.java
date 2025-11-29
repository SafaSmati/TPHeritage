package exercice2;

public abstract class Sportif extends Star {

    protected String club;
    protected int anneesExperience;

    public Sportif(String nom, String nationalite, int age, String club, int anneesExperience) {
        super(nom, nationalite, age);
        this.club = club;
        this.anneesExperience = anneesExperience;
    }

    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }

    public int getAnneesExperience() { return anneesExperience; }
    public void setAnneesExperience(int anneesExperience) { this.anneesExperience = anneesExperience; }

    public abstract void afficherStatistiques();
}

