package fr.diginamic.banque.entities;

/**
 * Liste des methodes obligatoires que doit posseder un objet géométrique
 * @author ADJANOR
 */
public interface ObjetGeometrique {
    /**
     * Retourne le perimetre d'une forme géometrique
     * @return double
     */
    double perimetre();

    /**
     * Retourne la surface
     * @return double
     */
    double surface();


    /**
     * Retourne la valeur de getType
     * @return getType
     */
    public abstract String getType();

}
