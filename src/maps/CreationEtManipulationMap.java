package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {

    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        //Ajouter de nuvelles informations à cette map

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(32, "Bordeaux");

        //Afficher l'ensemble des clefs de la map

        System.out.println("on affiche les clefs: ");
        for (Integer s: mapVilles.keySet()
             ) {
            System.out.println(s);
        }

        System.out.println("**************");
        //Afficher l'ensemble des valeurs de la map
        System.out.println( "On affiche les valeurs : ");
        for (String s: mapVilles.values()
        ) {
            System.out.println(s);
        }

        System.out.println("**************");
        System.out.println("Les clés & valeurs de la mapVille sont : ");
        for (Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clé: " + key + ", Valeur: " + value);
        }

        System.out.println("**************");
        //Afficher la taille de la map
        System.out.println( "La taille de cette map est de : " + mapVilles.size());
    }

}
