package fr.diginamic.recensement;

import java.util.ArrayList;

public class Region implements Comparable<Region>{
    public String nomDeLaRegion;
    public int populationTotale;
    ArrayList<Ville> villes;
    ArrayList<Region> regions;


    public Region(String nomDeLaRegion, int populationTotale, ArrayList<Ville> villes, ArrayList<Region> regions) {
        this.nomDeLaRegion = nomDeLaRegion;
        this.populationTotale = populationTotale;
        this.villes = villes;
        this.regions = regions;
    }



    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Region{" +
                "nomDeLaRegion='" + nomDeLaRegion + '\'' +
                ", populationTotale=" + populationTotale +
                ", villes=" + villes +
                '}';
    }

    @Override
    public int compareTo(Region o) {
        int result = this.getPopulationTotale() - (o.getPopulationTotale());
        return result;
    }
}
