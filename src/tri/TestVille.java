package tri;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TestVille {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
                villes.add(new Ville("Nice", 343000));
                villes.add(new Ville("Carcasonne", 47800));
                villes.add(new Ville("Narbonne", 53400));
                villes.add(new Ville("Lyon", 484000));
                villes.add(new Ville("Foix", 9700));
                villes.add(new Ville("Pau", 77200));
                villes.add(new Ville("Marseille", 850700));
                villes.add(new Ville("Tarbes", 40600));

        Collections.sort(villes, new ComparatorHabitant());

        System.out.println("Liste des villes par ordre croissant du nombre d'habitants :");
                for (Ville ville : villes) {
                    System.out.println(ville);
                }

        System.out.println("\n");
        Collections.sort(villes, new ComparatorNom());

        System.out.println("Liste des villes par ordre alphabétique :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

    }
}
