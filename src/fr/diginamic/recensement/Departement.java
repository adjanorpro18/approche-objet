package fr.diginamic.recensement;

import java.util.ArrayList;

public class Departement implements Comparable<Departement>{
    private String codeDepartement;
    private int populationTotale;
    ArrayList<Ville> villes;
    ArrayList<Departement> departements;


    public Departement(String codeDepartement, int populationTotale, ArrayList<Ville> villes, ArrayList<Departement> departements) {
        this.codeDepartement = codeDepartement;
        this.populationTotale = populationTotale;
        this.villes = villes;
        this.departements = departements;
    }

    public Departement(Recensement recensement, String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
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

    public ArrayList<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(ArrayList<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "codeDepartement='" + codeDepartement + '\'' +
                ", populationTotale=" + populationTotale +
                ", villes=" + villes +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        int result = this.getPopulationTotale() - (o.getPopulationTotale());
        return result;
    }
}
