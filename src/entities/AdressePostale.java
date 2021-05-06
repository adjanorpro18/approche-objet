package entities;

public class AdressePostale {
    public int numeroRue;
    public String libelleRue;
    public String codePostale;
    public String ville;

    public AdressePostale(int numeroRue, String libelleRue, String codePostale, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        this.ville = ville;
    }
}
