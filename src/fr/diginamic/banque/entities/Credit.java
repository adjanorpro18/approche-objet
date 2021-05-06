package fr.diginamic.banque.entities;

public class Credit extends Operation{


    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public String toString() {
        return date + " " + montant;
    }

    @Override
    public String getType() {
        return "CREDIT" ;
    }
}
