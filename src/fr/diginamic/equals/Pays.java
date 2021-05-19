package fr.diginamic.equals;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double pibHabitant;

    public Pays(String nom, int nbHabitants, double pibHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitant = pibHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public double getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(double pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pays){
            return nom.equals(((Pays) o).nom) &&
                    nbHabitants == ((Pays) o).nbHabitants &&
                    pibHabitant == ((Pays) o).pibHabitant;
        }
        return false;
    }
}
