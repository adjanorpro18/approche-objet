package fr.diginamic.banque.entities;

public class TestBanque {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

     Compte compte = new Compte(22555, 345.90);
     CompteTaux compteTaux = new CompteTaux(22555, 1000, 0.01);
        System.out.println(compte);
        System.out.println(compteTaux);

        Compte [] comptes = new Compte[2];
        comptes[0] = new Compte(22555, 345.20 );
        comptes[1] = new CompteTaux(22555, 345.20, 0.01);

        for (Compte compt : comptes
             ) {
            System.out.println(compt);
        }
    }



}
