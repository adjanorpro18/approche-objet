package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String[] args) {

        //Premier liste de couleur

        List <String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        //Deuxième liste de couleur

        List <String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // liste qui contient l'ensemble des données des deux listes

        List<String> liste3 = new ArrayList<String>();

        //Je parcours d'abord la liste1 puis j'ajoute la liste3
        for (String couleur : liste1) {
            liste3.add(couleur);
        }

        //Je parcours d'abord la liste2 puis j'ajoute la liste3
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        //Pour afficher la liste3

        System.out.println("La liste des couleurs: ");
        for (String couleur : liste3) {
            System.out.println(couleur);
        }
        System.out.println(liste3.size());

        //Pour afficher la liste3: par la methode addAll()


    }
}
