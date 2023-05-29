package modele;

/**
 * cette classe va être utilisé pour extraire des données relatives aux quêtes pour les rendre exploitables et plus lisibles / compréhensibles
 */

public class Quete {

    /**
     * methode constructeur de la classe Quete qui instancie les différents champs d'une certaine ligne
     *
     * @param ligne String La ligne dont on veut extraire des informations
     */
    public Quete(String ligne){

    }

    /**
     * permet d'extraire la position et de la ranger dans une tableau d'entiers
     *
     * @param position String La position que l'on veut extraire
     * @return tabpos int[] Le tableau avec la position
     */
    public int[] extraitPos(String position){

    }

    /**
     * permet d'extraire la précondition et de la ranger dans une tableau d'entiers
     *
     * @param precond String La précondition que l'on veut extraire
     * @return tabPreconditions int[] Le tableau avec la précondition
     */
    public int[] extraitPrecond(String precond){

    }

    /**
     * affiche une ligne de quête de maniere lisible avec toutes les informations utiles
     *
     * @return String
     */
    public  String toString(){
    }

    /**
     * permet d'avoir le numero d'une quete
     *
     * @return numero int
     */
    public int getNumero(){

    }

    /**
     * permet d'avoir la position d'une quete
     *
     * @return pos int[]
     */
    public int[] getPos(){

    }

    /**
     * permet d'avoir la précondition d'une quete
     *
     * @return precond int[]
     */
    public int[] getPrecond(){

    }

    /**
     * permet d'avoir la durré d'une quete
     *
     * @return duree int
     */
    public int getDuree(){

    }

    /**
     * permet d'avoir l'experience d'une quete
     *
     * @return experience int
     */
    public int getExperience(){

    }

    /**
     * permet d'avoir l'intitulé d'une quete
     *
     * @return intitule String
     */
    public String getIntitule(){

    }

}
