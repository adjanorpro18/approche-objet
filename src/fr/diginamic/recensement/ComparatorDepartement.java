package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Departement> {


    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getPopulationTotale() - o2.getPopulationTotale();
    }
}
