package fr.diginamic.banque.entities;

public class Rectangle implements ObjetGeometrique{
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

    @Override
    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    @Override
    public String getType() {
        return "RECTANGLE";
    }
}
