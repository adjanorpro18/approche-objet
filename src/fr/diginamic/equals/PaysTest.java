package fr.diginamic.equals;

public class PaysTest {
    public static void main(String[] args) {

        Pays pays1 = new Pays("pays1", 70_000_000, 40493.93);
        Pays pays2 = new Pays("pays2", 15_000_000, 46493.93);


        //boolean result = pays1.equals(pays2);
        boolean result = pays1 == pays2;
        System.out.println(result);

    }
}
