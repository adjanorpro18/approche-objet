package fr.diginamic.recensement;

public class Ville implements Comparable<Ville>{
    private String codeRegion, nomDeLaRegion, codeDepartement, codeCommune, nomDeLaCommune;
    int populationTotale;

    public Ville(String codeRegion, String nomDeLaRegion, String codeDepartement, String codeCommune, String nomDeLaCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomDeLaRegion = nomDeLaRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomDeLaCommune = nomDeLaCommune;
        this.populationTotale = populationTotale;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomDeLaRegion='" + nomDeLaRegion + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomDeLaCommune='" + nomDeLaCommune + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }

    @Override
    public int compareTo(Ville o) {
        int result = this.getPopulationTotale() - (o.getPopulationTotale());
        return result;
    }
}
