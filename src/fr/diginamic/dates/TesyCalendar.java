package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TesyCalendar {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date date = cal.getTime();
        System.out.println(date);

        SimpleDateFormat formateur1 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formateur1.format(date));

        SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formateur.format(new Date()));

        SimpleDateFormat francais = new SimpleDateFormat(" EEEE MMMM yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(francais.format(new Date()));

        SimpleDateFormat russe = new SimpleDateFormat(" EEEE MMMM yyyy HH:mm:ss", new Locale("ru"));
        System.out.println(russe.format(new Date()));

        SimpleDateFormat allemand = new SimpleDateFormat(" EEEE MMMM yyyy HH:mm:ss",  Locale.GERMAN);
        System.out.println(allemand.format(new Date()));

        SimpleDateFormat chinois = new SimpleDateFormat(" EEEE MMMM yyyy HH:mm:ss",  Locale.CHINESE);
        System.out.println(chinois.format(new Date()));

    }
}
