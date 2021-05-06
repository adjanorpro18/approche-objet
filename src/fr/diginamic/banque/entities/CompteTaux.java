package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public CompteTaux(int numero, double solde, double tauxRemuneration) {
        super(numero, solde);
        this.tauxRemuneration = tauxRemuneration;

    }

    @Override
    public String toString() {
        return
                "Le numero  de compte " + numero +
                " a un solde de " + solde +
                " euros avec un taux de Remuneration de " + tauxRemuneration ;
    }
}
