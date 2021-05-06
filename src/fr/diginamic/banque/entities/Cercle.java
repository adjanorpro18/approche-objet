package fr.diginamic.banque.entities;

public class Cercle implements ObjetGeometrique{
    private    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon * 2 * Math.PI;
    }

    @Override
    public double surface() {
        return Math.pow(rayon,2)* Math.PI;
    }

    @Override
    public String getType() {
        return "CERCLE";
    }
}
