package maps;

import java.util.HashMap;
import java.util.Map;

public class FusionMap {

    public static void main(String args[]) {
        
    // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        
    // Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
        
    // Création map3 qui prendra l'ensemble des éléments des autres maps
        
        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.putAll(map1);
        map3.putAll(map2);

        System.out.println("On affiche les clefs : ");
        for (Integer s: map3.keySet()
        ) {
            System.out.println(s);
        }

        System.out.println("On affiche les valeurs: ");
        for (String s: map3.values()
        ) {
            System.out.println(s);
        }

        //System.out.println("Les clés & valeurs de la map3 sont : ");
       // for (Map.Entry<Integer, String> entry : map3.entrySet()) {
         //   Integer key = entry.getKey();
           // String value = entry.getValue();
            //System.out.println("Clé: " + key + ", Valeur: " + value);
        //}

        
    }
}
