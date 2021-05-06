package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale(
                7,
                "rue des Planchers",
                "31500",
                "Toulouse"
        );

        Personne personne = new Personne(
                "Dupont" ,
                "Hervé",
                adresse
        );

        System.out.println("La première personne est : "
                + personne.nom + " "
                + personne.prenom + " "
                + personne.adresse.numeroRue + " "
                + personne.adresse.libelleRue  + ""
                + personne.adresse.codePostale + ""
                + personne.adresse.ville);

        personne.afficherMajuscule();
    }

}
