package fr.diginamic.banque.entities;

public class TestOperation {

    public static void main(String[] args) {



        Operation [] operations = new Operation[4];

        operations[0] = new Credit("12/03/2020", 320d);
        operations[1] = new Debit("11/04/2020", -45d);
        operations[2] = new Credit("7/03/2021", 52d);
        operations[3] = new Debit("19/04/2021", 250d);

        float montantGlobal = 0;

        for ( Operation operation: operations
             ) {

            System.out.println(operation.getType());
            System.out.println(operation.toString());

            if(operation.getType() == "CREDIT")
                montantGlobal += operation.getMontant();

            if(operation.getType()=="DEBIT")
                montantGlobal+= operation.getMontant();

            System.out.println("Montant Global :" + montantGlobal);

        }

    }
}
