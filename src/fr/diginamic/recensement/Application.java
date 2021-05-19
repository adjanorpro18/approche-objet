package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        //Etape1: Mise en place de la lecture du fichier

        Path paths = Paths.get("./recensement.csv");

        try {
            List<String> lignes = Files.readAllLines(paths,StandardCharsets.UTF_8);
            ArrayList<Ville> villes = new ArrayList<>();
            Iterator <String> iterator = lignes.iterator();
            iterator.next();
            //System.out.println(iterator.next());// afficahge de la premiere ligne du fichier
            while (iterator.hasNext()) { // Pour toutes les lignes suivantes
                String Line = iterator.next();
                String[] tabVille = Line.split(";");
                Ville ville = new Ville(tabVille[0],tabVille[1],tabVille[2],tabVille[5],tabVille[6],Integer.parseInt((tabVille[7]).replaceAll(" ", "")));
                villes.add(ville);
               //System.out.println(ville.toString());
            }
            //System.out.println(villes.size()); // Le nombre total de villes dans le fichier
            Recensement recensement = new Recensement(villes);
            // menu d'affichage des villes

                System.out.println("-------------------------Menu Principal--------------------------");
                System.out.println("                   1.Population d'une ville donnée                       ");
                System.out.println("                   2.Population d'un département  donnée                 ");
                System.out.println("                   3.Population d'une région donnée                      ");
                System.out.println("                   4.Afficher les 10 régions les plus peuplées           ");
                System.out.println("                   5.Afficher les 10 départements les plus peuplés       ");
                System.out.println("                   6.Afficher les 10 villes les plus peuplées d'un département       ");
                System.out.println("                   7.Afficher les 10 villes les plus peuplées d'une région           ");
                System.out.println("                   8.Afficher les 10 villes les plus peuplées de France              ");
                System.out.println("                   9.Quitter                                              ");
                System.out.println("                   Taper votre choix :                                    ");

            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
            //différents choix de methodes
            do
            {
                switch(choix)
                {
                    case 1:
                        RecherchePopulationVille villePop = new RecherchePopulationVille();
                        System.out.println("Veuillez saisir le nom d'une ville ? " );
                        villePop.traiter(recensement, scanner);
                        break;

                    case 2:
                        RecherchePopulationDepartement departementPop = new RecherchePopulationDepartement();
                        System.out.println("Veuillez saisir un code d'un département ? ");
                        departementPop.traiter(recensement, scanner);
                        break;


                    case 3:
                        RecherchePopulationRegion regionPop = new RecherchePopulationRegion();
                        System.out.println("Veuillez saisir le nom de la region:  ");
                        regionPop.traiter(recensement, scanner);
                        break;

                    case 4:
                        ArrayList<Departement> departements = new ArrayList<>();
                        for (Ville ville: recensement.getVilles()) {
                            if(!trier(departements, ville.getCodeDepartement())){
                                Departement departement = new Departement(recensement, ville.getCodeDepartement());
                                departements.add(departement);
                            }
                        }
                        Collections.sort(departements, new ComparatorDepartement());
                        System.out.println("La liste des 10 departements les plus peuplés");
                        //for (Departement departement: departements
                           //  ) {

                           // System.out.println(departement);
                        //}
                        for (int i = departements.size(); i < departements.size()-10; i--) {
                        }
                        System.out.println(departements.size());

                        break;
                    case 5:

                        break;


                    default:
                        break;
                }
            }while(choix == 9);





        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    //Methode pour trier les départements
    public static boolean trier(ArrayList<Departement> departements, String codeDepartement){
        for (Departement departement: departements
        ) {
            if(departement.getCodeDepartement().equalsIgnoreCase(String.valueOf(codeDepartement))){
                return true;
            }
        }
        return false;
    }
}
