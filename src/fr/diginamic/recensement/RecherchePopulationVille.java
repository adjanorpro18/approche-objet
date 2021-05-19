package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        String villeName = scanner.next();
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        boolean findVille = false;

        //Condition de recherche de la ville avec sa population

         while (iterator.hasNext() && !findVille) {
             Ville ville = iterator.next();
             if(ville.getNomDeLaCommune().equalsIgnoreCase(villeName))
             {
                 System.out.println("La population de la ville de  " +  ville.getNomDeLaCommune() +  "  est de  " +  ville.getPopulationTotale());
                 findVille = true;
             }
         }
         if(!findVille){
             System.out.println("Ville inconnue");
         }
    }
}
