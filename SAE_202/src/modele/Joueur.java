package modele;


import java.util.ArrayList;

public class Joueur {
    private int chExperience;
    private int chPositionX;
    private int chPositionY;
    private int chTemps;
    private int chDistance;
    private int chNbQuetes;
    private final ArrayList<Integer> chQuetesCompleteesGloutonne;
    private final ArrayList<Integer> chQuetesCompleteesExhaustive;

    /**
     * Methode constructeur de la classe Joueur,
     * elle sert à initialiser les champs à zero
     */
    public Joueur() {
        chExperience = 0;
        chPositionX = 0;
        chPositionY = 0;
        chTemps = 0;
        chDistance = 0;
        chNbQuetes = 0;
        chQuetesCompleteesGloutonne = new ArrayList<>();
        chQuetesCompleteesExhaustive = new ArrayList<>();

    }

    /**
     * Cette methode permet au joueur de completer une quete et d'ajouter les statistiques de la quete au joueur une fois cette derniere fini
     *
     * @param quete Quete La quete fait par le joueur
     */
    public void completerQueteGloutonne(Quete quete) {
        if (quete.getNumero() != 0){
            chExperience += quete.getExperience();
        }
        chPositionX = quete.getPos()[0];
        chPositionY = quete.getPos()[1];
        chTemps += quete.getDuree();
        chNbQuetes += 1;
        chQuetesCompleteesGloutonne.add(quete.getNumero());
    }

    /**
     * Cette methode permet au joueur de completer une quete et d'ajouter les statistiques de la quete au joueur une fois cette derniere fini
     *
     * @param quete Quete La quete fait par le joueur
     */
    public void completerQueteExhaustive(Quete quete) {
        if (quete.getNumero() != 0){
            chExperience += quete.getExperience();
        }
        chPositionX = quete.getPos()[0];
        chPositionY = quete.getPos()[1];
        chTemps += quete.getDuree();
        chNbQuetes += 1;
        chQuetesCompleteesExhaustive.add(quete.getNumero());

    }


    /**
     * Cette methode regarde grace au numéro de quete si elle a deja été complété
     *
     * @param numeroQuete int Le numero de la quete que l'on veut vérifier
     * @return boolean True si la quete a été faite et False sinon
     */
    public boolean queteCompleteeGloutonne(int numeroQuete) {
        return chQuetesCompleteesGloutonne.contains(numeroQuete);
    }

    /**
     * Cette methode regarde grace au numéro de quete si elle a deja été complété
     *
     * @param numeroQuete int Le numero de la quete que l'on veut vérifier
     * @return boolean True si la quete a été faite et False sinon
     */
    public boolean queteCompleteeExhaustive(int numeroQuete) {
        return chQuetesCompleteesExhaustive.contains(numeroQuete);
    }

    /**
     *Verifie si toutes les quetes d'un scenario ont été faites
     *
     * @param scenario Scenario Le scenario que l'on veut étudier
     * @return boolean False si toutes les quetes du scenario n'ont pas été fini et True si toutes les quetes sont fini
     */
    public boolean toutesQuetesCompletees(Scenario scenario) {

    }

    /**
     *Calcule la disctance à parcourir pour aller à une quete depuis la position du joueur
     *
     * @param positionQuete int[] La position de la quete qu'on peut obtenir avec une methode getPos
     * @return int disctance en X et distance en Y
     */
    public int calculerDistance(int[] positionQuete) {

    }

    /**
     *Permet de recuperer l'experience qui a été accumulé par un joueur
     *
     * @return chExperience int Experience du joueur
     */
    public int getExperience() {

    }

    /**
     *Permet de recuperer la position en X d'un joueur
     *
     * @return chPositionX int Position en X
     */
    public int getPositionX() {

    }

    /**
     *Permet de recuperer la position en Y d'un joueur
     *
     * @return chPositionY int Position en Y
     */
    public int getPositionY() {

    }

    /**
     * Recupère le temps mis par le joueur
     *
     * @return chTemps int Temps mis par le joueur
     */
    public int getTemps() {

    }

    /**
     * Affiche le chemin des quetes realisé par le joueur avec la solution gloutonne
     */
    public void afficherCheminQuetesGloutonne() {

    }


    /**
     * Permet d'avoir une liste de toutes les quetes realisable par le joueur
     * @param scenario Scenario Le scenario que l'on veut parcourir
     * @return quetesDisponibles ArrayList<Quete> La liste des quetes
     */
    public ArrayList<Quete> getQuetesDisponiblesGloutonne(Scenario scenario) {

    }

    /**
     * Recupere les quetes qui sont disponibles pour etre utilisé dans la solution exhaustive
     * depuis un scenario donné et les mets dans une liste
     *
     * @param scenario Scenario Le scenario dont on veut extraire les quetes disponible pour l'exhaustive
     * @return quetesDisponibles ArrayList<Quete>
     */
    public ArrayList<Quete> getQuetesDisponiblesExhaustive(Scenario scenario) {

    }

    /**
     * Cette methode sera utilisé uniquement pour la solution gloutonne
     * regarde si la précondition d'une quete est satisfaite (donc si on peut faire la quete) et nous retourne un boolean
     *
     * @param quete Quete La quete dont on veut vérifier si la précondition est satisfaite
     * @return boolean True si la précondition est satisfaite et False s'il ne l'est pas
     */
    private boolean preconditionsSatisfaitesGloutonne(Quete quete) {

    }

    /**
     * Cette methode sera utilisé uniquement pour la solution exhaustive
     * regarde si la précondition d'une quete est satisfaite (donc si on peut faire la quete) et nous retourne un boolean
     *
     * @param quete Quete La quete dont on veut vérifier si la précondition est satisfaite
     * @return boolean True si la précondition est satisfaite et False s'il ne l'ait pas
     */
    private boolean preconditionsSatisfaitesExhaustive(Quete quete) {

    }

    /**
     * Ajoute un certain temps de déplacement au champ chTemps du joueur.
     *
     * @param tempsDeplacement int Le temps de déplacement à ajouter
     */
    public void ajouterTempsDeplacement(int tempsDeplacement) {


    }

    /**
     * Deplace le joueur case par case cers la coordonnée X,Y de la quete
     * Les coordonnées X,Y de la quete sont données en parametre
     *
     * @param destinationX int La coordonnée X de la quête
     * @param destinationY int La coordonnée Y de la quête
     */
    public void seDeplacerVers(int destinationX, int destinationY) {

    }

    /**
     * Recupere la valeur du champ ChDistance
     * @return chDistance int Distance parcourue par le joueur
     */
    public int getChDistance(){

    }

    /**
     * Récupère la valeur du champ chNbQuetes
     * @return chNbQuetes int Nombre de Quêtes réalisé par le joueur
     */
    public int getChNbQuetes(){

    }



}
