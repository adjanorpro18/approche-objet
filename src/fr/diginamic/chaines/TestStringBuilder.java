package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        long debutStringBuilder = System.currentTimeMillis();

        for(int i = 1; i <= 100000; i++){
            builder.append(i);
        }

        long finStringBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Temps écoulé en millisecondes :" + (finStringBuilder - debutStringBuilder));



        String string = new String();
        long debutString = System.currentTimeMillis();

        for(int i = 1; i <= 100000; i++){
            string +=i;
        }

        long finString = System.currentTimeMillis();
        System.out.println("String Temps écoulé en millisecondes :" + (finString - debutString));



        StringBuffer buffer = new StringBuffer();

        long debutStringBuffer = System.currentTimeMillis();

        for(int i = 1; i <= 100000; i++){
            buffer.append(i);
        }

        long finStringBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Temps écoulé en millisecondes :" + (finStringBuffer - debutStringBuffer));


    }
}
