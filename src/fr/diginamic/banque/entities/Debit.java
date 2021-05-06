package fr.diginamic.banque.entities;

public class Debit  extends Operation{


    public Debit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return date + " " + montant;
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
