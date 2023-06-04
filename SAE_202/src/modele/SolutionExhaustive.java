package modele;


import java.util.ArrayList;

public class SolutionExhaustive {

    private Scenario scenario;
    private Joueur joueur;

    /**
     * Methode constructeur de la classe SolutionExhaustive et permet d'instancier les deux champs
     * @param scenario Scenario
     * @param joueur Joueur
     */
    public SolutionExhaustive(Scenario scenario, Joueur joueur) {
        this.scenario = scenario;
        this.joueur = joueur;
    }

    /**
     * Méthode pour trouver la quête la plus proche en termes de position
     * @param quetesDisponibles ArrayList<Quete> La liste de quete qui sont disponible ( on a eu cette liste grace à la methode getQuetesDisponibles)
     * @return quetePlusProche Quete La quete la plus proche
     */
    public Quete trouverQuetePlusProche(ArrayList<Quete> quetesDisponibles) {

    }

    /**
     * Méthode principale pour exécuter la solution exhaustive.
     * Elle parcourt toutes les quêtes disponibles jusqu'à ce que toutes soient complétées.
     */
    public void solutionExhaustive() {


    }

    /**
     * Parcourt les quêtes disponibles et réalise la quête la plus proche à chaque étape.
     * Si aucune quête n'est disponible ou toutes les quêtes sont complétées,
     * affiche les statistiques finales du joueur et le chemin des quêtes réalisées.
     */
    private void parcourirQuetes() {

    }




}
