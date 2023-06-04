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
        ArrayList<Quete> quetesScenario = scenario.getChQuetes();
        for (Quete quete : quetesScenario) {
            if (!chQuetesCompleteesGloutonne.contains(quete.getNumero())) {
                return false;
            }
        }
        return true;
    }

    /**
     *Calcule la disctance à parcourir pour aller à une quete depuis la position du joueur
     *
     * @param positionQuete int[] La position de la quete qu'on peut obtenir avec une methode getPos
     * @return int disctance en X et distance en Y
     */
    public int calculerDistance(int[] positionQuete) {
        int distanceX = Math.abs(chPositionX - positionQuete[0]);
        int distanceY = Math.abs(chPositionY - positionQuete[1]);

        return distanceX + distanceY;
    }

    /**
     *Permet de recuperer l'experience qui a été accumulé par un joueur
     *
     * @return chExperience int Experience du joueur
     */
    public int getExperience() {

        return chExperience;
    }
    /**
     *Permet de recuperer la position en X d'un joueur
     *
     * @return chPositionX int Position en X
     */
    public int getPositionX() {

        return chPositionX;

    }

    /**
     *Permet de recuperer la position en Y d'un joueur
     *
     * @return chPositionY int Position en Y
     */
    public int getPositionY() {

        return chPositionY;

    }

    /**
     * Recupère le temps mis par le joueur
     *
     * @return chTemps int Temps mis par le joueur
     */
    public int getTemps() {

        return  chTemps;

    }

    /**
     * Affiche le chemin des quetes realisé par le joueur avec la solution gloutonne
     */
    public void afficherCheminQuetesGloutonne() {
        System.out.println("Chemin des quêtes réalisées pour la solution gloutonne :");

        // Parcours de la liste des numéros de quêtes complétées (chQuetesCompletees)
        for (Integer numeroQuete : chQuetesCompleteesGloutonne) {
            System.out.println("Quete numero " + numeroQuete);
        }
    }

    /**
     * Affiche le chemin des quetes realisé par le joueur avec la solution exhaustive
     */
    public void afficherCheminQuetesExhaustive() {
        System.out.println("Chemin des quêtes réalisées pour la solution exhaustive :");
        for (Integer numeroQuete : chQuetesCompleteesExhaustive) {
            System.out.println("Quête numéro " + numeroQuete);
        }
    }


    /**
     * Permet d'avoir une liste de toutes les quetes realisable par le joueur
     * @param scenario Scenario Le scenario que l'on veut parcourir
     * @return quetesDisponibles ArrayList<Quete> La liste des quetes
     */
    public ArrayList<Quete> getQuetesDisponiblesGloutonne(Scenario scenario) {
        ArrayList<Quete> quetesDisponibles = new ArrayList<>();
        // Parcours la liste quetes du scenario récuperer grace à .getQuetes (scenario.getQuetes())
        for (Quete quete : scenario.getChQuetes()) {
            if (!queteCompleteeGloutonne(quete.getNumero()) && preconditionsSatisfaitesGloutonne(quete)) {
                quetesDisponibles.add(quete);
            }
        }

        return quetesDisponibles;
    }

    /**
     * Recupere les quetes qui sont disponibles pour etre utilisé dans la solution exhaustive
     * depuis un scenario donné et les mets dans une liste
     *
     * @param scenario Scenario Le scenario dont on veut extraire les quetes disponible pour l'exhaustive
     * @return quetesDisponibles ArrayList<Quete>
     */
    public ArrayList<Quete> getQuetesDisponiblesExhaustive(Scenario scenario) {
        ArrayList<Quete> quetesDisponibles = new ArrayList<>();
        // Parcours la liste quetes du scenario récuperer grace à .getQuetes (scenario.getQuetes())
        for (Quete quete : scenario.getChQuetes()) {
            if (!queteCompleteeExhaustive(quete.getNumero()) && preconditionsSatisfaitesExhaustive(quete)) {
                quetesDisponibles.add(quete);
            }
        }

        return quetesDisponibles;
    }

    /**
     * Cette methode sera utilisé uniquement pour la solution gloutonne
     * regarde si la précondition d'une quete est satisfaite (donc si on peut faire la quete) et nous retourne un boolean
     *
     * @param quete Quete La quete dont on veut vérifier si la précondition est satisfaite
     * @return boolean True si la précondition est satisfaite et False s'il ne l'est pas
     */
    public boolean preconditionsSatisfaitesGloutonne(Quete quete) {
        int[] preconditions = quete.getPrecond();

        // Vérifier les deux premières préconditions
        if (preconditions[1] == 0 && preconditions[0] != 0) {
            // Si le deuxième indice est zéro et le premier n'est pas zéro,
            // alors la quête a une précondition à vérifier
            int quetePrecondition = preconditions[0];
            if (!queteCompleteeGloutonne(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[1] != 0) {
            // Si le deuxième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            int quetePrecondition1 = preconditions[0];
            int quetePrecondition2 = preconditions[1];
            if (!queteCompleteeGloutonne(quetePrecondition1) && !queteCompleteeGloutonne(quetePrecondition2)) {
                return false;
            }
        }

        // Vérifier les deux dernières préconditions
        if (preconditions[3] == 0 && preconditions[2] != 0) {
            // Si le quatrième indice est zéro et le troisième n'est pas zéro,
            // alors la quête a une précondition à vérifier
            int quetePrecondition = preconditions[2];
            if (!queteCompleteeGloutonne(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[3] != 0) {
            // Si le quatrième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            int quetePrecondition1 = preconditions[2];
            int quetePrecondition2 = preconditions[3];
            if (!queteCompleteeGloutonne(quetePrecondition1) && !queteCompleteeGloutonne(quetePrecondition2)) {
                return false;
            }
        }

        // Toutes les préconditions sont satisfaites
        return true;

    }

    /**
     * Cette methode sera utilisé uniquement pour la solution exhaustive
     * regarde si la précondition d'une quete est satisfaite (donc si on peut faire la quete) et nous retourne un boolean
     *
     * @param quete Quete La quete dont on veut vérifier si la précondition est satisfaite
     * @return boolean True si la précondition est satisfaite et False s'il ne l'ait pas
     */
    public boolean preconditionsSatisfaitesExhaustive(Quete quete) {
        int[] preconditions = quete.getPrecond();

        // Vérifier les deux premières préconditions
        if (preconditions[1] == 0 && preconditions[0] != 0) {
            // Si le deuxième indice est zéro et le premier n'est pas zéro,
            // alors la quête a une précondition à vérifier
            int quetePrecondition = preconditions[0];
            if (!queteCompleteeExhaustive(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[1] != 0) {
            // Si le deuxième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            int quetePrecondition1 = preconditions[0];
            int quetePrecondition2 = preconditions[1];
            if (!queteCompleteeExhaustive(quetePrecondition1) && !queteCompleteeExhaustive(quetePrecondition2)) {
                return false;
            }
        }

        // Vérifier les deux dernières préconditions
        if (preconditions[3] == 0 && preconditions[2] != 0) {
            // Si le quatrième indice est zéro et le troisième n'est pas zéro,
            // alors la quête a une précondition à vérifier
            int quetePrecondition = preconditions[2];
            if (!queteCompleteeExhaustive(quetePrecondition)) {
                return false;
            }
        } else if (preconditions[3] != 0) {
            // Si le quatrième indice n'est pas zéro,
            // alors la quête a deux préconditions à vérifier
            int quetePrecondition1 = preconditions[2];
            int quetePrecondition2 = preconditions[3];
            if (!queteCompleteeExhaustive(quetePrecondition1) && !queteCompleteeExhaustive(quetePrecondition2)) {
                return false;
            }
        }

        // Toutes les préconditions sont satisfaites
        return true;
    }

    /**
     * Ajoute un certain temps de déplacement au champ chTemps du joueur.
     *
     * @param tempsDeplacement int Le temps de déplacement à ajouter
     */
    public void ajouterTempsDeplacement(int tempsDeplacement) {

        chTemps += tempsDeplacement;

    }

    /**
     * Deplace le joueur case par case cers la coordonnée X,Y de la quete
     * Les coordonnées X,Y de la quete sont données en parametre
     *
     * @param destinationX int La coordonnée X de la quête
     * @param destinationY int La coordonnée Y de la quête
     */
    public void seDeplacerVers(int destinationX, int destinationY) { ////////////a voir
        int positionX = chPositionX;
        int positionY = chPositionY;
        //int temps = chTemps;

        while (positionX != destinationX || positionY != destinationY) {
            int deltaX = destinationX - positionX;
            int deltaY = destinationY - positionY;

            if (Math.abs(deltaX) > Math.abs(deltaY)) {
                // Se déplacer horizontalement
                int pasX = (deltaX > 0) ? 1 : -1;
                positionX += pasX;
            } else {
                // Se déplacer verticalement
                int pasY = (deltaY > 0) ? 1 : -1;
                positionY += pasY;
            }

            chPositionX = positionX;
            chPositionY = positionY;

            // Ajouter un certain temps au champ chTemps du joueur
            ajouterTempsDeplacement(1);
            //temps = chTemps +1 ;
            chDistance += 1;
        }
    }

    /**
     * Recupere la valeur du champ ChDistance
     * @return chDistance int Distance parcourue par le joueur
     */
    public int getChDistance(){

        return chDistance;
    }

    /**
     * Récupère la valeur du champ chNbQuetes
     * @return chNbQuetes int Nombre de Quêtes réalisé par le joueur
     */
    public int getChNbQuetes(){

    }



}
