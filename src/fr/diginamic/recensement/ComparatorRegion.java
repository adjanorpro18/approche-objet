package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Region> {


    @Override
    public int compare(Region o1, Region o2) {

        return o1.getPopulationTotale() - o2.getPopulationTotale();
    }
}
