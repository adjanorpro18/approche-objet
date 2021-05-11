package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVille {
    public static void main(String[] args) {


        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(
                new Ville("Nice", 343000),
                new Ville("Carcasonne", 47800),
                new Ville("Carcasonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600)));


        // Je recupère la ville la plus peuplée
        Ville villeLaPlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villeLaPlusPeuplee.getNbHabitants())
                villeLaPlusPeuplee = ville;
        }
        System.out.println("Ville la plus peuplée : " + villeLaPlusPeuplee);

        // Je supprime la ville la moins peuplée
        int indexVilleMoinsPeuplee = 0;
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() <= villes.get(indexVilleMoinsPeuplee).getNbHabitants())
                indexVilleMoinsPeuplee = i;
        }
        villes.remove(indexVilleMoinsPeuplee);

        // Mettre en majuscule les villes de plus de 100_000 habitants
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000)
                ville.setNom(ville.getNom().toUpperCase());
        }


        // On affiche le resultat
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
