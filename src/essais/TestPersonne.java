package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse = new AdressePostale();
        adresse.numeroRue = 7;
        adresse.libelleRue = "rue des Planchers";
        adresse.codePostale = "31500";
        adresse.ville = "Toulouse";


        Personne personne = new Personne();
        personne.nom = "ADJANOR";
        personne.prenom = "Enyon";
        personne.adresse = adresse;


        Personne personne2 = new Personne();
        personne2.nom = "LAGES";
        personne2.prenom = "Marie";
        personne2.adresse = adresse;


        System.out.println("La première personne est : "
                + personne.nom + " "
                + personne.prenom + " "
                + personne.adresse.numeroRue + " "
                + personne.adresse.libelleRue  + ""
                + personne.adresse.codePostale + ""
                + personne.adresse.ville);

        System.out.println("La seconde personne est : "
                + personne2.nom + " "
                + personne2.prenom + " "
                + personne2.adresse.numeroRue + " "
                + personne2.adresse.libelleRue  + ""
                + personne2.adresse.codePostale + ""
                + personne2.adresse.ville);

    }
}
