package fr.diginamic.recensement;

import java.util.ArrayList;

public class Recensement {

    ArrayList<Ville> villes;
    ArrayList<Departement> departements;
    ArrayList<Region> regions;

    public Recensement(ArrayList<Departement> departements, ArrayList<Region> regions) {
        this.departements = departements;
        this.regions = regions;
    }

    public Recensement(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    public void setVilles(ArrayList<Ville> villes) {
        this.villes = villes;
    }

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> departements) {
        this.departements = departements;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
