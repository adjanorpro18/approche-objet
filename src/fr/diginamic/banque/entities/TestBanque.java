package fr.diginamic.banque.entities;

public class TestBanque {
    public static void main(String[] args) {

        Compte compte = new Compte(122555, 345.90);

        System.out.println("Le compte " + compte.getNumero() + " a un solde de  " + compte.getSolde());

    }
}
