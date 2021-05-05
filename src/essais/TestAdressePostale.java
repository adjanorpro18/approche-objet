package essais;

import entities.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale();
        adresse.numeroRue = 78;
        adresse.libelleRue = "Chemin de l'Eglise";
        adresse.codePostale = "31000";
        adresse.ville = "Toulouse";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 12;
        adresse2.libelleRue = "Chemin des Maraichers";
        adresse2.codePostale = "44000";
        adresse2.ville = "Nantes";

        System.out.println("La première adresse est : "
                + adresse.numeroRue + " "
                + adresse.libelleRue + " "
                + adresse.codePostale + " "
                + adresse.ville);

        System.out.println("La première adresse2 est : "
                + adresse2.numeroRue + " "
                + adresse2.libelleRue + " "
                + adresse2.codePostale + " "
                + adresse2.ville );

    }
}
