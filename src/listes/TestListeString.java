package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<String>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        // La ville ayant le plus garnd nombre de mots

        System.out.println(villes.size());

        int indexMax = 0;
        for (int i = 0; i < villes.size(); i++) {
            if(villes.get(i).length() > villes.get(indexMax).length() )
                indexMax = i;

        }
        System.out.println("La ville qui a plus de lettre est " + villes.get(indexMax));


        // Toutes villes en majuscule

        Iterator<String> iterator = villes.iterator();

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i,villes.get(i).toUpperCase());
        }

        System.out.println("Les villes en majuscules ");
        for (String ville : villes) {
            System.out.println(ville);
        }


        // Suppression des villes qui commence par la lettre N

        while (iterator.hasNext()){
            if (iterator.next().charAt(0) == 'N')
                iterator.remove();
        }
        System.out.println("Les villes sans celles commençant par la lettre N ");
        for (String ville : villes) {
            System.out.println(ville);
        }









    }
}
