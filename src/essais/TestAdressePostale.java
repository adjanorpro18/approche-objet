package essais;

import entities.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale(
                78,
                "Chemin de l'Eglise",
                "31000",
                "Toulouse"
                );


        AdressePostale adresse2 = new AdressePostale(
                12,
                "Chemin des Maraichers",
                "44000",
                "Nantes"
        );


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
