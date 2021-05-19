package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        int codeDepartement = scanner.nextInt();
        Iterator<Ville> iteratorVille = recensement.getVilles().iterator();
        int populationDepartement = 0;
        while (iteratorVille.hasNext()){
            Ville ville = iteratorVille.next();
            if(ville.getCodeDepartement().equalsIgnoreCase(String.valueOf(codeDepartement)))
            {
                System.out.println(ville);
                populationDepartement += ville.getPopulationTotale();
            }
        }
        System.out.println("La population du département " +  codeDepartement +" est de " + populationDepartement);
    }

    //Methode pour trier les départements
    public static boolean trier(ArrayList<Departement> departements, int codeDepartement){
        for (Departement departement: departements
             ) {
            if(departement.getCodeDepartement().equalsIgnoreCase(String.valueOf(codeDepartement))){
                return true;
            }
        }
        return false;
    }

}
