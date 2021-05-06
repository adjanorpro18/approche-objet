package fr.diginamic.banque.entities;

public class Compte {
    protected int numero;
    protected double solde;

    public Compte(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return
                "Le numéro de compte " + numero +
                "a un solde de " + solde + "\n";
    }
}
