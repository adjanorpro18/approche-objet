package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> nombres = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5 ));

        // Afficher tous les elements de la liste
        System.out.println("La liste des éléments de la liste: ");
        for (Integer nombre : nombres) {
            System.out.println(nombre);
        }

        // Afficher la taille de la liste
        System.out.println("La taille de la liste est: " + nombres.size());

        // La plus grande valeur du tableau

        int plusGrand = nombres.get(0);
        Integer plusPetit = nombres.get(0);
        for(int i= 1; i< nombres.size(); i++){
            if(nombres.get(i) > plusGrand)
                plusGrand = nombres.get(i);
            if(nombres.get(i) < plusPetit)
                plusPetit = nombres.get(i);

        }

        System.out.println("La valeur la plus grande de la liste des nombres est :"+ plusGrand);

        nombres.remove(plusPetit);

        System.out.println("Le resultat sans le plus petit est :");
        for (Integer nombre : nombres) {
            System.out.println(nombre);

        }

        //Supprimer les valeurs negatives

        for (int i = 0; i < nombres.size(); i++) {
            if(nombres.get(i) < 0)
                nombres.set(i, Math.abs(nombres.get(i)));

        }
        System.out.println("Le resultat sans les valeurs négatives est :");
        for (Integer nombre : nombres) {
            System.out.println(nombre);

        }

    }

}
