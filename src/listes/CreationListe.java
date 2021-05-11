package listes;


import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {

        //creation d'un ArrayList d'entiers de 1 à 100

        List <Integer> entiers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
           entiers.add(i);
        }
        System.out.println( "La taille de la liste des entiers est de: " + entiers.size());
    }

}
