package fr.diginamic.banque.entities;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique [] geometries = new ObjetGeometrique[2];

            geometries[0] = new Cercle(15);
            geometries[1]= new Rectangle(7.5, 3.5);



        for (ObjetGeometrique geometrie :geometries
             ) {
            //System.out.println(geometrie.getClass().getName());
            if(geometrie.getType() == "CERCLE"){
                System.out.println("Le perimetre du cercle: " + geometrie.perimetre());
                System.out.println("La surface du cercle  : " + geometrie.surface());

            }
            if(geometrie.getType() == "RECTANGLE"){
                System.out.println("Le perimetre du rectangle: " + geometrie.perimetre());
                System.out.println("La surface du rectangle: " + geometrie.surface());
            }

        }
    }
}
