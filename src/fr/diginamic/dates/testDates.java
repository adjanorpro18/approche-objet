package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class testDates {
    public static void main(String[] args) {

        //Instance de date

        SimpleDateFormat dateDuJour = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
        System.out.println(dateDuJour.format(new Date()));

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(date.format(new Date(19,5,2016, 23,59,30)));

        SimpleDateFormat date1 = new SimpleDateFormat("dd/HH", Locale.FRANCE);
        System.out.println(date1.format(new Date()));



    }
}
