package fr.diginamic.recensement;

import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        scanner.nextLine();
        String  nomDeLaRegion = scanner.nextLine();
        Iterator<Ville> iterator = recensement.getVilles().iterator();
        int populationRegion = 0;
        while (iterator.hasNext()){
            Ville ville = iterator.next();
            if(ville.getNomDeLaRegion().equalsIgnoreCase(nomDeLaRegion))
            {
                //System.out.println(ville);
                populationRegion += ville.getPopulationTotale();
            }
        }
        System.out.println("La population de la région de " + nomDeLaRegion + " est de " + populationRegion);
    }
}
