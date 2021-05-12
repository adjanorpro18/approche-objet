package maps;


import maps.Ville;

import java.util.HashMap;
import java.util.Map;


public class MapVilles {
    public static void main(String[] args) {

        HashMap<String,Ville> villeHashMap = new HashMap<>();

        villeHashMap.put("ville1", new Ville("ville1", 3000));
        villeHashMap.put("ville2", new Ville("ville2", 4000));
        villeHashMap.put("ville3", new Ville("ville3", 2000));
        villeHashMap.put("ville4", new Ville("ville4", 6000));


        //Rechercher et supprimer la ville ayant le moins d'habitants

        String villeKeyMinHabitants = null;
        for(Map.Entry<String, Ville> stringVilleEntry : villeHashMap.entrySet()){

            if(villeKeyMinHabitants == null)
                villeKeyMinHabitants = stringVilleEntry.getKey();
            else if (stringVilleEntry.getValue().getNbHabitants() < villeHashMap.get(villeKeyMinHabitants).getNbHabitants())
                villeKeyMinHabitants = stringVilleEntry.getKey();
        }

        villeHashMap.remove(villeKeyMinHabitants);

        for (Ville value: villeHashMap.values()
             ) {
            System.out.println(value);
        }




    }
}
