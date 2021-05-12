package maps;

public class Pays {
    private String nom, continent;
    private int nbHabitants;


    public Pays(String nom, String continent, int nbHabitants) {
        this.nom = nom;
        this.continent = continent;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}
