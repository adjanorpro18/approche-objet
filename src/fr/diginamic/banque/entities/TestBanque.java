package fr.diginamic.banque.entities;

public class TestBanque {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

     Compte compte = new Compte(22555, 345.90);

        System.out.println(compte.toString());



    }
}
